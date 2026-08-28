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

public class ctr extends ezc {
   private static final String d = "raids";
   public static final Codec<ctr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ctr.a.a.listOf().optionalFieldOf("raids", List.of()).forGetter($$0x -> $$0x.e.int2ObjectEntrySet().stream().map(ctr.a::a).toList()),
               Codec.INT.fieldOf("next_id").forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("tick").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ctr::new)
   );
   public static final ezd<ctr> b = new ezd<>("raids", ctr::new, a, bbf.l);
   public static final ezd<ctr> c = new ezd<>("raids_end", ctr::new, a, bbf.l);
   private final Int2ObjectMap<ctp> e = new Int2ObjectOpenHashMap();
   private int f = 1;
   private int g;

   public static ezd<ctr> a(jg<efd> $$0) {
      return $$0.a(efb.c) ? c : b;
   }

   public ctr() {
      this.f();
   }

   private ctr(List<ctr.a> $$0, int $$1, int $$2) {
      for (ctr.a $$3 : $$0) {
         this.e.put($$3.b, $$3.c);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public ctp a(int $$0) {
      return (ctp)this.e.get($$0);
   }

   public OptionalInt a(ctp $$0) {
      ObjectIterator var2 = this.e.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<ctp> $$1 = (Entry<ctp>)var2.next();
         if ($$1.getValue() == $$0) {
            return OptionalInt.of($$1.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   public void a(aru $$0) {
      this.g++;
      Iterator<ctp> $$1 = this.e.values().iterator();

      while ($$1.hasNext()) {
         ctp $$2 = $$1.next();
         if ($$0.O().c(djv.D)) {
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

      agq.a($$0, this.e.values());
   }

   public static boolean a(ctq $$0) {
      return $$0.bJ() && $$0.gE() && $$0.ew() <= 2400;
   }

   @Nullable
   public ctp a(arv $$0, iw $$1) {
      if ($$0.Z_()) {
         return null;
      } else {
         aru $$2 = $$0.y();
         if ($$2.O().c(djv.D)) {
            return null;
         } else {
            efd $$3 = $$2.F_();
            if (!$$3.c()) {
               return null;
            } else {
               List<ciz> $$4 = $$2.A().c($$0x -> $$0x.a(axq.b), $$1, 64, ciy.b.b).toList();
               int $$5 = 0;
               ffs $$6 = ffs.c;

               for (ciz $$7 : $$4) {
                  iw $$8 = $$7.g();
                  $$6 = $$6.b((double)$$8.u(), (double)$$8.v(), (double)$$8.w());
                  $$5++;
               }

               iw $$9;
               if ($$5 > 0) {
                  $$6 = $$6.c(1.0 / (double)$$5);
                  $$9 = iw.a((jq)$$6);
               } else {
                  $$9 = $$1;
               }

               ctp $$11 = this.a($$2, $$9);
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

   private ctp a(aru $$0, iw $$1) {
      ctp $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new ctp($$1, $$0.an());
   }

   public static ctr a(ua $$0) {
      return a.parse(uo.a, $$0).resultOrPartial().orElseGet(ctr::new);
   }

   private int a() {
      return ++this.f;
   }

   @Nullable
   public ctp a(iw $$0, int $$1) {
      ctp $$2 = null;
      double $$3 = (double)$$1;
      ObjectIterator var6 = this.e.values().iterator();

      while (var6.hasNext()) {
         ctp $$4 = (ctp)var6.next();
         double $$5 = $$4.q().j($$0);
         if ($$4.r() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }

   static record a(int b, ctp c) {
      public static final Codec<ctr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("id").forGetter(ctr.a::a), ctp.b.forGetter(ctr.a::b)).apply($$0, ctr.a::new)
      );

      public static ctr.a a(Entry<ctp> $$0) {
         return new ctr.a($$0.getIntKey(), (ctp)$$0.getValue());
      }

      public int a() {
         return this.b;
      }

      public ctp b() {
         return this.c;
      }
   }
}
