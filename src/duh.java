import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class duh {
   private static final Map<String, duh> k = new Object2ObjectArrayMap();
   public static final Codec<duh> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final duh b = new duh(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sa.g), Optional.of(sa.n), Optional.of(sa.C), Optional.of(sa.I)
   );
   public static final duh c = new duh(
      "spruce", 0.5F, Optional.of(sa.q), Optional.of(sa.r), Optional.of(sa.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final duh d = new duh(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sa.x), Optional.of(sa.y), Optional.empty(), Optional.empty()
   );
   public static final duh e = new duh("azalea", Optional.empty(), Optional.of(sa.w), Optional.empty());
   public static final duh f = new duh("birch", Optional.empty(), Optional.of(sa.i), Optional.of(sa.F));
   public static final duh g = new duh("jungle", Optional.of(sa.p), Optional.of(sa.o), Optional.empty());
   public static final duh h = new duh("acacia", Optional.empty(), Optional.of(sa.j), Optional.empty());
   public static final duh i = new duh("cherry", Optional.empty(), Optional.of(sa.z), Optional.of(sa.K));
   public static final duh j = new duh("dark_oak", Optional.of(sa.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ald<edg<?, ?>>> n;
   private final Optional<ald<edg<?, ?>>> o;
   private final Optional<ald<edg<?, ?>>> p;
   private final Optional<ald<edg<?, ?>>> q;
   private final Optional<ald<edg<?, ?>>> r;
   private final Optional<ald<edg<?, ?>>> s;

   public duh(String $$0, Optional<ald<edg<?, ?>>> $$1, Optional<ald<edg<?, ?>>> $$2, Optional<ald<edg<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public duh(
      String $$0,
      float $$1,
      Optional<ald<edg<?, ?>>> $$2,
      Optional<ald<edg<?, ?>>> $$3,
      Optional<ald<edg<?, ?>>> $$4,
      Optional<ald<edg<?, ?>>> $$5,
      Optional<ald<edg<?, ?>>> $$6,
      Optional<ald<edg<?, ?>>> $$7
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
   private ald<edg<?, ?>> a(azn $$0, boolean $$1) {
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
   private ald<edg<?, ?>> a(azn $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arj $$0, dwp $$1, jf $$2, dus $$3, azn $$4) {
      ald<edg<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jo<edg<?, ?>> $$6 = $$0.G_().e(lw.aK).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     edg<?, ?> $$9 = $$6.a();
                     dus $$10 = dho.a.n();
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

      ald<edg<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jo<edg<?, ?>> $$12 = $$0.G_().e(lw.aK).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            edg<?, ?> $$13 = $$12.a();
            dus $$14 = $$0.b_($$2).g();
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

   private static boolean a(dus $$0, ddo $$1, jf $$2, int $$3, int $$4) {
      dhm $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dek $$0, jf $$1) {
      for (jf $$2 : jf.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awv.V)) {
            return true;
         }
      }

      return false;
   }
}
