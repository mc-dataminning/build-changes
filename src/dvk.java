import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dvk {
   private static final Map<String, dvk> k = new Object2ObjectArrayMap();
   public static final Codec<dvk> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dvk b = new dvk(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sf.g), Optional.of(sf.n), Optional.of(sf.C), Optional.of(sf.I)
   );
   public static final dvk c = new dvk(
      "spruce", 0.5F, Optional.of(sf.q), Optional.of(sf.r), Optional.of(sf.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dvk d = new dvk(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sf.x), Optional.of(sf.y), Optional.empty(), Optional.empty()
   );
   public static final dvk e = new dvk("azalea", Optional.empty(), Optional.of(sf.w), Optional.empty());
   public static final dvk f = new dvk("birch", Optional.empty(), Optional.of(sf.i), Optional.of(sf.F));
   public static final dvk g = new dvk("jungle", Optional.of(sf.p), Optional.of(sf.o), Optional.empty());
   public static final dvk h = new dvk("acacia", Optional.empty(), Optional.of(sf.j), Optional.empty());
   public static final dvk i = new dvk("cherry", Optional.empty(), Optional.of(sf.z), Optional.of(sf.K));
   public static final dvk j = new dvk("dark_oak", Optional.of(sf.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ali<eei<?, ?>>> n;
   private final Optional<ali<eei<?, ?>>> o;
   private final Optional<ali<eei<?, ?>>> p;
   private final Optional<ali<eei<?, ?>>> q;
   private final Optional<ali<eei<?, ?>>> r;
   private final Optional<ali<eei<?, ?>>> s;

   public dvk(String $$0, Optional<ali<eei<?, ?>>> $$1, Optional<ali<eei<?, ?>>> $$2, Optional<ali<eei<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dvk(
      String $$0,
      float $$1,
      Optional<ali<eei<?, ?>>> $$2,
      Optional<ali<eei<?, ?>>> $$3,
      Optional<ali<eei<?, ?>>> $$4,
      Optional<ali<eei<?, ?>>> $$5,
      Optional<ali<eei<?, ?>>> $$6,
      Optional<ali<eei<?, ?>>> $$7
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
   private ali<eei<?, ?>> a(azu $$0, boolean $$1) {
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
   private ali<eei<?, ?>> a(azu $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arp $$0, dxr $$1, jh $$2, dvv $$3, azu $$4) {
      ali<eei<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jq<eei<?, ?>> $$6 = $$0.J_().e(ma.aJ).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eei<?, ?> $$9 = $$6.a();
                     dvv $$10 = dis.a.m();
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

      ali<eei<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jq<eei<?, ?>> $$12 = $$0.J_().e(ma.aJ).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eei<?, ?> $$13 = $$12.a();
            dvv $$14 = $$0.b_($$2).g();
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

   private static boolean a(dvv $$0, der $$1, jh $$2, int $$3, int $$4) {
      diq $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dfn $$0, jh $$1) {
      for (jh $$2 : jh.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axc.V)) {
            return true;
         }
      }

      return false;
   }
}
