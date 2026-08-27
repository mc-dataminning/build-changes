import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dfq {
   private static final Map<String, dfq> k = new Object2ObjectArrayMap();
   public static final Codec<dfq> a = asg.a((Function<dfq, String>)($$0 -> $$0.l), k::get);
   public static final dfq b = new dfq(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(pt.g), Optional.of(pt.n), Optional.of(pt.C), Optional.of(pt.I)
   );
   public static final dfq c = new dfq(
      "spruce", 0.5F, Optional.of(pt.q), Optional.of(pt.r), Optional.of(pt.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dfq d = new dfq(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(pt.x), Optional.of(pt.y), Optional.empty(), Optional.empty()
   );
   public static final dfq e = new dfq("azalea", Optional.empty(), Optional.of(pt.w), Optional.empty());
   public static final dfq f = new dfq("birch", Optional.empty(), Optional.of(pt.i), Optional.of(pt.F));
   public static final dfq g = new dfq("jungle", Optional.of(pt.p), Optional.of(pt.o), Optional.empty());
   public static final dfq h = new dfq("acacia", Optional.empty(), Optional.of(pt.j), Optional.empty());
   public static final dfq i = new dfq("cherry", Optional.empty(), Optional.of(pt.z), Optional.of(pt.K));
   public static final dfq j = new dfq("dark_oak", Optional.of(pt.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<afv<dob<?, ?>>> n;
   private final Optional<afv<dob<?, ?>>> o;
   private final Optional<afv<dob<?, ?>>> p;
   private final Optional<afv<dob<?, ?>>> q;
   private final Optional<afv<dob<?, ?>>> r;
   private final Optional<afv<dob<?, ?>>> s;

   public dfq(String $$0, Optional<afv<dob<?, ?>>> $$1, Optional<afv<dob<?, ?>>> $$2, Optional<afv<dob<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dfq(
      String $$0,
      float $$1,
      Optional<afv<dob<?, ?>>> $$2,
      Optional<afv<dob<?, ?>>> $$3,
      Optional<afv<dob<?, ?>>> $$4,
      Optional<afv<dob<?, ?>>> $$5,
      Optional<afv<dob<?, ?>>> $$6,
      Optional<afv<dob<?, ?>>> $$7
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
   private afv<dob<?, ?>> a(ate $$0, boolean $$1) {
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
   private afv<dob<?, ?>> a(ate $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(alq $$0, dhy $$1, ht $$2, dgb $$3, ate $$4) {
      afv<dob<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ib<dob<?, ?>> $$6 = $$0.H_().d(jz.at).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dob<?, ?> $$9 = $$6.a();
                     dgb $$10 = cuc.a.o();
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

      afv<dob<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ib<dob<?, ?>> $$12 = $$0.H_().d(jz.at).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dob<?, ?> $$13 = $$12.a();
            dgb $$14 = $$0.b_($$2).g();
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

   private static boolean a(dgb $$0, cqf $$1, ht $$2, int $$3, int $$4) {
      cua $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cra $$0, ht $$1) {
      for (ht $$2 : ht.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(aqs.U)) {
            return true;
         }
      }

      return false;
   }
}
