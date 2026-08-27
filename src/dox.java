import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dox {
   private static final Map<String, dox> k = new Object2ObjectArrayMap();
   public static final Codec<dox> a = awu.a((Function<dox, String>)($$0 -> $$0.l), k::get);
   public static final dox b = new dox(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rj.g), Optional.of(rj.n), Optional.of(rj.C), Optional.of(rj.I)
   );
   public static final dox c = new dox(
      "spruce", 0.5F, Optional.of(rj.q), Optional.of(rj.r), Optional.of(rj.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dox d = new dox(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rj.x), Optional.of(rj.y), Optional.empty(), Optional.empty()
   );
   public static final dox e = new dox("azalea", Optional.empty(), Optional.of(rj.w), Optional.empty());
   public static final dox f = new dox("birch", Optional.empty(), Optional.of(rj.i), Optional.of(rj.F));
   public static final dox g = new dox("jungle", Optional.of(rj.p), Optional.of(rj.o), Optional.empty());
   public static final dox h = new dox("acacia", Optional.empty(), Optional.of(rj.j), Optional.empty());
   public static final dox i = new dox("cherry", Optional.empty(), Optional.of(rj.z), Optional.of(rj.K));
   public static final dox j = new dox("dark_oak", Optional.of(rj.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<aju<dxr<?, ?>>> n;
   private final Optional<aju<dxr<?, ?>>> o;
   private final Optional<aju<dxr<?, ?>>> p;
   private final Optional<aju<dxr<?, ?>>> q;
   private final Optional<aju<dxr<?, ?>>> r;
   private final Optional<aju<dxr<?, ?>>> s;

   public dox(String $$0, Optional<aju<dxr<?, ?>>> $$1, Optional<aju<dxr<?, ?>>> $$2, Optional<aju<dxr<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dox(
      String $$0,
      float $$1,
      Optional<aju<dxr<?, ?>>> $$2,
      Optional<aju<dxr<?, ?>>> $$3,
      Optional<aju<dxr<?, ?>>> $$4,
      Optional<aju<dxr<?, ?>>> $$5,
      Optional<aju<dxr<?, ?>>> $$6,
      Optional<aju<dxr<?, ?>>> $$7
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
   private aju<dxr<?, ?>> a(axt $$0, boolean $$1) {
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
   private aju<dxr<?, ?>> a(axt $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(apu $$0, drf $$1, id $$2, dpi $$3, axt $$4) {
      aju<dxr<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         in<dxr<?, ?>> $$6 = $$0.H_().d(ku.az).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dxr<?, ?> $$9 = $$6.a();
                     dpi $$10 = dcj.a.n();
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

      aju<dxr<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         in<dxr<?, ?>> $$12 = $$0.H_().d(ku.az).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dxr<?, ?> $$13 = $$12.a();
            dpi $$14 = $$0.b_($$2).g();
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

   private static boolean a(dpi $$0, cym $$1, id $$2, int $$3, int $$4) {
      dch $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(czh $$0, id $$1) {
      for (id $$2 : id.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(ave.U)) {
            return true;
         }
      }

      return false;
   }
}
