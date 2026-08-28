import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class csp extends exs {
   private static final String d = "raids";
   public static final Codec<csp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               csp.a.a.listOf().optionalFieldOf("raids", List.of()).forGetter($$0x -> $$0x.e.int2ObjectEntrySet().stream().map(csp.a::a).toList()),
               Codec.INT.fieldOf("next_id").forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("tick").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, csp::new)
   );
   public static final ext<csp> b = new ext<>("raids", csp::new, a, bbb.l);
   public static final ext<csp> c = new ext<>("raids_end", csp::new, a, bbb.l);
   private final Int2ObjectMap<csn> e = new Int2ObjectOpenHashMap();
   private int f = 1;
   private int g;

   public static ext<csp> a(je<edw> $$0) {
      return $$0.a(edu.c) ? c : b;
   }

   public csp() {
      this.f();
   }

   private csp(List<csp.a> $$0, int $$1, int $$2) {
      for (csp.a $$3 : $$0) {
         this.e.put($$3.b, $$3.c);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public csn a(int $$0) {
      return (csn)this.e.get($$0);
   }

   public OptionalInt a(csn $$0) {
      ObjectIterator var2 = this.e.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<csn> $$1 = (Entry<csn>)var2.next();
         if ($$1.getValue() == $$0) {
            return OptionalInt.of($$1.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   public void a(arq $$0) {
      this.g++;
      Iterator<csn> $$1 = this.e.values().iterator();

      while ($$1.hasNext()) {
         csn $$2 = $$1.next();
         if ($$0.O().c(dir.C)) {
            $$2.m();
         }

         if ($$2.d()) {
            $$1.remove();
            this.f();
         } else {
            $$2.a($$0);
         }
      }

      if (this.g % 200 == 0) {
         this.f();
      }

      agm.a($$0, this.e.values());
   }

   public static boolean a(cso $$0) {
      return $$0.bK() && $$0.gA() && $$0.ev() <= 2400;
   }

   @Nullable
   public csn a(arr $$0, iu $$1) {
      if ($$0.U_()) {
         return null;
      } else {
         arq $$2 = $$0.y();
         if ($$2.O().c(dir.C)) {
            return null;
         } else {
            edw $$3 = $$2.B_();
            if (!$$3.c()) {
               return null;
            } else {
               List<cif> $$4 = $$2.A().c($$0x -> $$0x.a(axm.b), $$1, 64, cie.b.b).toList();
               int $$5 = 0;
               fei $$6 = fei.c;

               for (cif $$7 : $$4) {
                  iu $$8 = $$7.g();
                  $$6 = $$6.b((double)$$8.u(), (double)$$8.v(), (double)$$8.w());
                  $$5++;
               }

               iu $$9;
               if ($$5 > 0) {
                  $$6 = $$6.c(1.0 / (double)$$5);
                  $$9 = iu.a((jo)$$6);
               } else {
                  $$9 = $$1;
               }

               csn $$11 = this.a($$2, $$9);
               if (!$$11.i() && !this.e.containsValue($$11)) {
                  this.e.put(this.a(), $$11);
               }

               if (!$$11.i() || $$11.l() < $$11.k()) {
                  $$11.a($$0);
               }

               this.f();
               return $$11;
            }
         }
      }
   }

   private csn a(arq $$0, iu $$1) {
      csn $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new csn($$1, $$0.an());
   }

   public static csp a(tz $$0) {
      return a.parse(un.a, $$0).resultOrPartial().orElseGet(csp::new);
   }

   private int a() {
      return ++this.f;
   }

   @Nullable
   public csn a(iu $$0, int $$1) {
      csn $$2 = null;
      double $$3 = (double)$$1;
      ObjectIterator var6 = this.e.values().iterator();

      while (var6.hasNext()) {
         csn $$4 = (csn)var6.next();
         double $$5 = $$4.q().j($$0);
         if ($$4.r() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }

   static record a(int b, csn c) {
      public static final Codec<csp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("id").forGetter(csp.a::a), csn.b.forGetter(csp.a::b)).apply($$0, csp.a::new)
      );

      public static csp.a a(Entry<csn> $$0) {
         return new csp.a($$0.getIntKey(), (csn)$$0.getValue());
      }

      public int a() {
         return this.b;
      }

      public csn b() {
         return this.c;
      }
   }
}
