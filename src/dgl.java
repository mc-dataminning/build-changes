import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dgl {
   private static final Map<String, dgl> k = new Object2ObjectArrayMap();
   public static final Codec<dgl> a = asq.a((Function<dgl, String>)($$0 -> $$0.l), k::get);
   public static final dgl b = new dgl(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(pz.g), Optional.of(pz.n), Optional.of(pz.C), Optional.of(pz.I)
   );
   public static final dgl c = new dgl(
      "spruce", 0.5F, Optional.of(pz.q), Optional.of(pz.r), Optional.of(pz.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dgl d = new dgl(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(pz.x), Optional.of(pz.y), Optional.empty(), Optional.empty()
   );
   public static final dgl e = new dgl("azalea", Optional.empty(), Optional.of(pz.w), Optional.empty());
   public static final dgl f = new dgl("birch", Optional.empty(), Optional.of(pz.i), Optional.of(pz.F));
   public static final dgl g = new dgl("jungle", Optional.of(pz.p), Optional.of(pz.o), Optional.empty());
   public static final dgl h = new dgl("acacia", Optional.empty(), Optional.of(pz.j), Optional.empty());
   public static final dgl i = new dgl("cherry", Optional.empty(), Optional.of(pz.z), Optional.of(pz.K));
   public static final dgl j = new dgl("dark_oak", Optional.of(pz.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<agf<dow<?, ?>>> n;
   private final Optional<agf<dow<?, ?>>> o;
   private final Optional<agf<dow<?, ?>>> p;
   private final Optional<agf<dow<?, ?>>> q;
   private final Optional<agf<dow<?, ?>>> r;
   private final Optional<agf<dow<?, ?>>> s;

   public dgl(String $$0, Optional<agf<dow<?, ?>>> $$1, Optional<agf<dow<?, ?>>> $$2, Optional<agf<dow<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dgl(
      String $$0,
      float $$1,
      Optional<agf<dow<?, ?>>> $$2,
      Optional<agf<dow<?, ?>>> $$3,
      Optional<agf<dow<?, ?>>> $$4,
      Optional<agf<dow<?, ?>>> $$5,
      Optional<agf<dow<?, ?>>> $$6,
      Optional<agf<dow<?, ?>>> $$7
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
   private agf<dow<?, ?>> a(ato $$0, boolean $$1) {
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
   private agf<dow<?, ?>> a(ato $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(ama $$0, dit $$1, ht $$2, dgw $$3, ato $$4) {
      agf<dow<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ib<dow<?, ?>> $$6 = $$0.H_().d(jz.au).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dow<?, ?> $$9 = $$6.a();
                     dgw $$10 = cuv.a.o();
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

      agf<dow<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ib<dow<?, ?>> $$12 = $$0.H_().d(jz.au).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dow<?, ?> $$13 = $$12.a();
            dgw $$14 = $$0.b_($$2).g();
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

   private static boolean a(dgw $$0, cqy $$1, ht $$2, int $$3, int $$4) {
      cut $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(crt $$0, ht $$1) {
      for (ht $$2 : ht.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(arc.U)) {
            return true;
         }
      }

      return false;
   }
}
