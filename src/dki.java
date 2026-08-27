import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dki extends dea {
   public static final MapCodec<dki> a = b(dki::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dsd d = drt.aZ;
   private static final ImmutableList<js> e = ImmutableList.of(
      new js(0, 0, -1), new js(-1, 0, 0), new js(0, 0, 1), new js(1, 0, 0), new js(-1, 0, -1), new js(1, 0, -1), new js(-1, 0, 1), new js(1, 0, 1)
   );
   private static final ImmutableList<js> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(js::o).iterator())
      .addAll(e.stream().map(js::p).iterator())
      .add(new js(0, 1, 0))
      .build();

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bpy.a($$2.B);
      } else {
         return $$5 == bpv.a && a($$4.b(bpv.b)) && m($$1) ? bpy.e : bpy.d;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$0.c(d) == 0) {
         return bpw.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bpw.a($$1.B);
      } else {
         if (!$$1.B) {
            aqo $$5 = (aqo)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avi.vw, avj.e, 1.0F, 1.0F);
               return bpw.a;
            }
         }

         return bpw.b;
      }
   }

   private static boolean a(ctq $$0) {
      return $$0.a(ctt.fu);
   }

   private static boolean m(drd $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(io $$0, daz $$1) {
      emw $$2 = $$1.b_($$0);
      if (!$$2.a(awc.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            emw $$4 = $$1.b_($$0.d());
            return !$$4.a(awc.a);
         }
      }
   }

   private void d(drd $$0, daz $$1, final io $$2) {
      $$1.a($$2, false);
      boolean $$3 = it.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awc.a);
      das $$5 = new das() {
         @Override
         public Optional<Float> a(dar $$0, daf $$1, io $$2x, drd $$3, emw $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dec.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eum $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, daz.a.b);
   }

   public static boolean a(daz $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable brw $$0, daz $$1, io $$2, drd $$3) {
      drd $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dvw.c, $$2, dvw.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avi.vu, avj.e, 1.0F, 1.0F);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avi.vt, avj.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ky.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   public static int a(drd $$0, int $$1) {
      return ayf.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return a($$0, 15);
   }

   public static Optional<eum> a(bsc<?> $$0, daj $$1, io $$2) {
      Optional<eum> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eum> a(bsc<?> $$0, daj $$1, io $$2, boolean $$3) {
      io.a $$4 = new io.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         js $$5 = (js)var5.next();
         $$4.g($$2).h($$5);
         eum $$6 = cny.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
