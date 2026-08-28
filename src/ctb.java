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

public class ctb extends eyh {
   private static final String d = "raids";
   public static final Codec<ctb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ctb.a.a.listOf().optionalFieldOf("raids", List.of()).forGetter($$0x -> $$0x.e.int2ObjectEntrySet().stream().map(ctb.a::a).toList()),
               Codec.INT.fieldOf("next_id").forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("tick").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ctb::new)
   );
   public static final eyi<ctb> b = new eyi<>("raids", ctb::new, a, bbb.l);
   public static final eyi<ctb> c = new eyi<>("raids_end", ctb::new, a, bbb.l);
   private final Int2ObjectMap<csz> e = new Int2ObjectOpenHashMap();
   private int f = 1;
   private int g;

   public static eyi<ctb> a(jf<eel> $$0) {
      return $$0.a(eej.c) ? c : b;
   }

   public ctb() {
      this.f();
   }

   private ctb(List<ctb.a> $$0, int $$1, int $$2) {
      for (ctb.a $$3 : $$0) {
         this.e.put($$3.b, $$3.c);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public csz a(int $$0) {
      return (csz)this.e.get($$0);
   }

   public OptionalInt a(csz $$0) {
      ObjectIterator var2 = this.e.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<csz> $$1 = (Entry<csz>)var2.next();
         if ($$1.getValue() == $$0) {
            return OptionalInt.of($$1.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   public void a(arq $$0) {
      this.g++;
      Iterator<csz> $$1 = this.e.values().iterator();

      while ($$1.hasNext()) {
         csz $$2 = $$1.next();
         if ($$0.O().c(djd.D)) {
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

   public static boolean a(cta $$0) {
      return $$0.bI() && $$0.gD() && $$0.ev() <= 2400;
   }

   @Nullable
   public csz a(arr $$0, iv $$1) {
      if ($$0.V_()) {
         return null;
      } else {
         arq $$2 = $$0.y();
         if ($$2.O().c(djd.D)) {
            return null;
         } else {
            eel $$3 = $$2.B_();
            if (!$$3.c()) {
               return null;
            } else {
               List<cim> $$4 = $$2.A().c($$0x -> $$0x.a(axm.b), $$1, 64, cil.b.b).toList();
               int $$5 = 0;
               fex $$6 = fex.c;

               for (cim $$7 : $$4) {
                  iv $$8 = $$7.g();
                  $$6 = $$6.b((double)$$8.u(), (double)$$8.v(), (double)$$8.w());
                  $$5++;
               }

               iv $$9;
               if ($$5 > 0) {
                  $$6 = $$6.c(1.0 / (double)$$5);
                  $$9 = iv.a((jp)$$6);
               } else {
                  $$9 = $$1;
               }

               csz $$11 = this.a($$2, $$9);
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

   private csz a(arq $$0, iv $$1) {
      csz $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new csz($$1, $$0.an());
   }

   public static ctb a(tz $$0) {
      return a.parse(un.a, $$0).resultOrPartial().orElseGet(ctb::new);
   }

   private int a() {
      return ++this.f;
   }

   @Nullable
   public csz a(iv $$0, int $$1) {
      csz $$2 = null;
      double $$3 = (double)$$1;
      ObjectIterator var6 = this.e.values().iterator();

      while (var6.hasNext()) {
         csz $$4 = (csz)var6.next();
         double $$5 = $$4.q().j($$0);
         if ($$4.r() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }

   static record a(int b, csz c) {
      public static final Codec<ctb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("id").forGetter(ctb.a::a), csz.b.forGetter(ctb.a::b)).apply($$0, ctb.a::new)
      );

      public static ctb.a a(Entry<csz> $$0) {
         return new ctb.a($$0.getIntKey(), (csz)$$0.getValue());
      }

      public int a() {
         return this.b;
      }

      public csz b() {
         return this.c;
      }
   }
}
