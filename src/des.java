import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class des {
   private static final Map<String, des> k = new Object2ObjectArrayMap();
   public static final Codec<des> a = arj.a((Function<des, String>)($$0 -> $$0.l), k::get);
   public static final des b = new des(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(ow.g), Optional.of(ow.n), Optional.of(ow.C), Optional.of(ow.I)
   );
   public static final des c = new des(
      "spruce", 0.5F, Optional.of(ow.q), Optional.of(ow.r), Optional.of(ow.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final des d = new des(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(ow.x), Optional.of(ow.y), Optional.empty(), Optional.empty()
   );
   public static final des e = new des("azalea", Optional.empty(), Optional.of(ow.w), Optional.empty());
   public static final des f = new des("birch", Optional.empty(), Optional.of(ow.i), Optional.of(ow.F));
   public static final des g = new des("jungle", Optional.of(ow.p), Optional.of(ow.o), Optional.empty());
   public static final des h = new des("acacia", Optional.empty(), Optional.of(ow.j), Optional.empty());
   public static final des i = new des("cherry", Optional.empty(), Optional.of(ow.z), Optional.of(ow.K));
   public static final des j = new des("dark_oak", Optional.of(ow.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<aey<dnd<?, ?>>> n;
   private final Optional<aey<dnd<?, ?>>> o;
   private final Optional<aey<dnd<?, ?>>> p;
   private final Optional<aey<dnd<?, ?>>> q;
   private final Optional<aey<dnd<?, ?>>> r;
   private final Optional<aey<dnd<?, ?>>> s;

   public des(String $$0, Optional<aey<dnd<?, ?>>> $$1, Optional<aey<dnd<?, ?>>> $$2, Optional<aey<dnd<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public des(
      String $$0,
      float $$1,
      Optional<aey<dnd<?, ?>>> $$2,
      Optional<aey<dnd<?, ?>>> $$3,
      Optional<aey<dnd<?, ?>>> $$4,
      Optional<aey<dnd<?, ?>>> $$5,
      Optional<aey<dnd<?, ?>>> $$6,
      Optional<aey<dnd<?, ?>>> $$7
   ) {
      this.l = $$0;
      this.m = $$1;
      this.n = $$2;
      this.o = $$3;
      this.p = $$4;
      this.q = $$5;
      this.r = $$6;
      this.s = $$7;
      k.put($$0, this);
   }

   @Nullable
   private aey<dnd<?, ?>> a(ash $$0, boolean $$1) {
      if ($$0.i() < this.m) {
         if ($$1 && this.s.isPresent()) {
            return this.s.get();
         }

         if (this.q.isPresent()) {
            return this.q.get();
         }
      }

      return $$1 && this.r.isPresent() ? this.r.get() : this.p.orElse(null);
   }

   @Nullable
   private aey<dnd<?, ?>> a(ash $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(akt $$0, dha $$1, gw $$2, dfd $$3, ash $$4) {
      aey<dnd<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         he<dnd<?, ?>> $$6 = $$0.G_().d(jc.at).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dnd<?, ?> $$9 = $$6.a();
                     dfd $$10 = cte.a.o();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 4);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 4);
                     return false;
                  }
               }
            }
         }
      }

      aey<dnd<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         he<dnd<?, ?>> $$12 = $$0.G_().d(jc.at).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dnd<?, ?> $$13 = $$12.a();
            dfd $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 4);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private static boolean a(dfd $$0, cph $$1, gw $$2, int $$3, int $$4) {
      ctc $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cqc $$0, gw $$1) {
      for (gw $$2 : gw.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(apv.U)) {
            return true;
         }
      }

      return false;
   }
}
