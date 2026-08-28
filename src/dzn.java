import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dzn {
   private static final Map<String, dzn> l = new Object2ObjectArrayMap();
   public static final Codec<dzn> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dzn b = new dzn(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rn.g), Optional.of(rn.q), Optional.of(rn.F), Optional.of(rn.M)
   );
   public static final dzn c = new dzn(
      "spruce", 0.5F, Optional.of(rn.t), Optional.of(rn.u), Optional.of(rn.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dzn d = new dzn(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rn.A), Optional.of(rn.B), Optional.empty(), Optional.empty()
   );
   public static final dzn e = new dzn("azalea", Optional.empty(), Optional.of(rn.z), Optional.empty());
   public static final dzn f = new dzn("birch", Optional.empty(), Optional.of(rn.l), Optional.of(rn.J));
   public static final dzn g = new dzn("jungle", Optional.of(rn.s), Optional.of(rn.r), Optional.empty());
   public static final dzn h = new dzn("acacia", Optional.empty(), Optional.of(rn.m), Optional.empty());
   public static final dzn i = new dzn("cherry", Optional.empty(), Optional.of(rn.C), Optional.of(rn.O));
   public static final dzn j = new dzn("dark_oak", Optional.of(rn.h), Optional.empty(), Optional.empty());
   public static final dzn k = new dzn("pale_oak", Optional.of(rn.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<alf<eiq<?, ?>>> o;
   private final Optional<alf<eiq<?, ?>>> p;
   private final Optional<alf<eiq<?, ?>>> q;
   private final Optional<alf<eiq<?, ?>>> r;
   private final Optional<alf<eiq<?, ?>>> s;
   private final Optional<alf<eiq<?, ?>>> t;

   public dzn(String $$0, Optional<alf<eiq<?, ?>>> $$1, Optional<alf<eiq<?, ?>>> $$2, Optional<alf<eiq<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dzn(
      String $$0,
      float $$1,
      Optional<alf<eiq<?, ?>>> $$2,
      Optional<alf<eiq<?, ?>>> $$3,
      Optional<alf<eiq<?, ?>>> $$4,
      Optional<alf<eiq<?, ?>>> $$5,
      Optional<alf<eiq<?, ?>>> $$6,
      Optional<alf<eiq<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private alf<eiq<?, ?>> a(azv $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private alf<eiq<?, ?>> a(azv $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(arq $$0, ebx $$1, iu $$2, dzz $$3, azv $$4) {
      alf<eiq<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         je<eiq<?, ?>> $$6 = $$0.F_().f(mg.aK).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eiq<?, ?> $$9 = $$6.a();
                     dzz $$10 = dmc.a.m();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 260);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 260);
                     return false;
                  }
               }
            }
         }
      }

      alf<eiq<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         je<eiq<?, ?>> $$12 = $$0.F_().f(mg.aK).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eiq<?, ?> $$13 = $$12.a();
            dzz $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 260);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 260);
               return false;
            }
         }
      }
   }

   private static boolean a(dzz $$0, dib $$1, iu $$2, int $$3, int $$4) {
      dma $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(diw $$0, iu $$1) {
      for (iu $$2 : iu.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axc.V)) {
            return true;
         }
      }

      return false;
   }
}
