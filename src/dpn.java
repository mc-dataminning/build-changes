import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dpn {
   private static final Map<String, dpn> k = new Object2ObjectArrayMap();
   public static final Codec<dpn> a = axe.a((Function<dpn, String>)($$0 -> $$0.l), k::get);
   public static final dpn b = new dpn(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rt.g), Optional.of(rt.n), Optional.of(rt.C), Optional.of(rt.I)
   );
   public static final dpn c = new dpn(
      "spruce", 0.5F, Optional.of(rt.q), Optional.of(rt.r), Optional.of(rt.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dpn d = new dpn(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rt.x), Optional.of(rt.y), Optional.empty(), Optional.empty()
   );
   public static final dpn e = new dpn("azalea", Optional.empty(), Optional.of(rt.w), Optional.empty());
   public static final dpn f = new dpn("birch", Optional.empty(), Optional.of(rt.i), Optional.of(rt.F));
   public static final dpn g = new dpn("jungle", Optional.of(rt.p), Optional.of(rt.o), Optional.empty());
   public static final dpn h = new dpn("acacia", Optional.empty(), Optional.of(rt.j), Optional.empty());
   public static final dpn i = new dpn("cherry", Optional.empty(), Optional.of(rt.z), Optional.of(rt.K));
   public static final dpn j = new dpn("dark_oak", Optional.of(rt.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ake<dyh<?, ?>>> n;
   private final Optional<ake<dyh<?, ?>>> o;
   private final Optional<ake<dyh<?, ?>>> p;
   private final Optional<ake<dyh<?, ?>>> q;
   private final Optional<ake<dyh<?, ?>>> r;
   private final Optional<ake<dyh<?, ?>>> s;

   public dpn(String $$0, Optional<ake<dyh<?, ?>>> $$1, Optional<ake<dyh<?, ?>>> $$2, Optional<ake<dyh<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dpn(
      String $$0,
      float $$1,
      Optional<ake<dyh<?, ?>>> $$2,
      Optional<ake<dyh<?, ?>>> $$3,
      Optional<ake<dyh<?, ?>>> $$4,
      Optional<ake<dyh<?, ?>>> $$5,
      Optional<ake<dyh<?, ?>>> $$6,
      Optional<ake<dyh<?, ?>>> $$7
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
   private ake<dyh<?, ?>> a(ayd $$0, boolean $$1) {
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
   private ake<dyh<?, ?>> a(ayd $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqe $$0, drv $$1, im $$2, dpy $$3, ayd $$4) {
      ake<dyh<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         iv<dyh<?, ?>> $$6 = $$0.H_().d(ld.aB).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dyh<?, ?> $$9 = $$6.a();
                     dpy $$10 = dcx.a.n();
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

      ake<dyh<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         iv<dyh<?, ?>> $$12 = $$0.H_().d(ld.aB).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dyh<?, ?> $$13 = $$12.a();
            dpy $$14 = $$0.b_($$2).g();
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

   private static boolean a(dpy $$0, cza $$1, im $$2, int $$3, int $$4) {
      dcv $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(czv $$0, im $$1) {
      for (im $$2 : im.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(avo.U)) {
            return true;
         }
      }

      return false;
   }
}
