import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ekt extends epi {
   public static final acq a = new acq("realms", "textures/gui/realms/slot_frame.png");
   public static final acq b = new acq("realms", "textures/gui/realms/empty_frame.png");
   public static final acq c = new acq("minecraft", "textures/gui/checkmark.png");
   public static final acq d = new acq("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final acq e = new acq("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final acq f = new acq("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final sw A = sw.c("mco.configure.world.slot.tooltip.active");
   private static final sw C = sw.c("mco.configure.world.slot.tooltip.minigame");
   private static final sw D = sw.c("mco.configure.world.slot.tooltip");
   private static final sw E = sw.c("mco.worldSlot.minigame");
   private final Supplier<ejq> F;
   private final Consumer<sw> G;
   private final int H;
   @Nullable
   private ekt.b I;

   public ekt(int $$0, int $$1, int $$2, int $$3, Supplier<ejq> $$4, Consumer<sw> $$5, int $$6, epi.c $$7) {
      super($$0, $$1, $$2, $$3, sv.a, $$7, x);
      this.F = $$4;
      this.H = $$6;
      this.G = $$5;
   }

   @Nullable
   public ekt.b a() {
      return this.I;
   }

   public void b() {
      ejq $$0 = this.F.get();
      if ($$0 != null) {
         ejx $$1 = $$0.i.get(this.H);
         boolean $$2 = this.H == 4;
         boolean $$3;
         String $$4;
         long $$5;
         String $$6;
         boolean $$7;
         if ($$2) {
            $$3 = $$0.m == ejq.c.b;
            $$4 = E.getString();
            $$5 = (long)$$0.p;
            $$6 = $$0.q;
            $$7 = $$0.p == -1;
         } else {
            $$3 = $$0.n == this.H && $$0.m != ejq.c.b;
            $$4 = $$1.a(this.H);
            $$5 = $$1.j;
            $$6 = $$1.k;
            $$7 = $$1.l;
         }

         ekt.a $$13 = a($$0, $$3, $$2);
         Pair<sw, sw> $$14 = this.a($$0, $$4, $$7, $$2, $$13);
         this.I = new ekt.b($$3, $$4, $$5, $$6, $$7, $$2, $$13, (sw)$$14.getFirst());
         this.b((sw)$$14.getSecond());
      }
   }

   private static ekt.a a(ejq $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if (!$$0.j && $$0.e != ejq.b.c) {
            return ekt.a.c;
         }
      } else {
         if (!$$2) {
            return ekt.a.b;
         }

         if (!$$0.j) {
            return ekt.a.b;
         }
      }

      return ekt.a.a;
   }

   private Pair<sw, sw> a(ejq $$0, String $$1, boolean $$2, boolean $$3, ekt.a $$4) {
      if ($$4 == ekt.a.a) {
         return Pair.of(null, sw.b($$1));
      } else {
         sw $$5;
         if ($$3) {
            if ($$2) {
               $$5 = sv.a;
            } else {
               $$5 = sv.a().f($$1).b(sv.t).f($$0.o);
            }
         } else {
            $$5 = sv.a().f($$1);
         }

         sw $$8;
         if ($$4 == ekt.a.c) {
            $$8 = A;
         } else {
            $$8 = $$3 ? C : D;
         }

         sw $$10 = $$8.e().b($$5);
         return Pair.of($$8, $$10);
      }
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      if (this.I != null) {
         this.a($$0, this.p(), this.r(), $$1, $$2, this.I.d, this.I.e, this.H, this.I.f, this.I.g, this.I.a, this.I.b, this.I.c, this.I.h);
      }
   }

   private void a(
      eox $$0,
      int $$1,
      int $$2,
      int $$3,
      int $$4,
      boolean $$5,
      String $$6,
      int $$7,
      long $$8,
      @Nullable String $$9,
      boolean $$10,
      boolean $$11,
      ekt.a $$12,
      @Nullable sw $$13
   ) {
      boolean $$14 = this.n();
      if (this.a_((double)$$3, (double)$$4) && $$13 != null) {
         this.G.accept($$13);
      }

      enn $$15 = enn.N();
      acq $$16;
      if ($$11) {
         $$16 = eme.a(String.valueOf($$8), $$9);
      } else if ($$10) {
         $$16 = b;
      } else if ($$9 != null && $$8 != -1L) {
         $$16 = eme.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$16 = d;
      } else if ($$7 == 2) {
         $$16 = e;
      } else if ($$7 == 3) {
         $$16 = f;
      } else {
         $$16 = b;
      }

      if ($$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a($$16, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      boolean $$23 = $$14 && $$12 != ekt.a.a;
      if ($$23) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else if ($$5) {
         $$0.a(0.8F, 0.8F, 0.8F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 0.0F, 0.0F, 80, 80, 80, 80);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if ($$5) {
         this.a($$0, $$1, $$2);
      }

      $$0.a($$15.h, $$6, $$1 + 40, $$2 + 66, 16777215);
   }

   private void a(eox $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(c, $$1 + 67, $$2 + 4, 0.0F, 0.0F, 9, 8, 9, 8);
      RenderSystem.disableBlend();
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static class b {
      final boolean d;
      final String e;
      final long f;
      @Nullable
      final String g;
      public final boolean a;
      public final boolean b;
      public final ekt.a c;
      @Nullable
      final sw h;

      b(boolean $$0, String $$1, long $$2, @Nullable String $$3, boolean $$4, boolean $$5, ekt.a $$6, @Nullable sw $$7) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
         this.h = $$7;
      }
   }
}
