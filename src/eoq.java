import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eoq extends etj {
   private static final afw s = new afw("widget/slot_frame");
   private static final afw t = new afw("icon/checkmark");
   public static final afw a = new afw("textures/gui/realms/empty_frame.png");
   public static final afw b = new afw("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final afw c = new afw("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final afw d = new afw("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final ui u = ui.c("mco.configure.world.slot.tooltip.active");
   private static final ui v = ui.c("mco.configure.world.slot.tooltip.minigame");
   private static final ui w = ui.c("mco.configure.world.slot.tooltip");
   private static final ui x = ui.c("mco.worldSlot.minigame");
   private final Supplier<eno> y;
   private final Consumer<ui> z;
   private final int A;
   @Nullable
   private eoq.b B;

   public eoq(int $$0, int $$1, int $$2, int $$3, Supplier<eno> $$4, Consumer<ui> $$5, int $$6, etj.c $$7) {
      super($$0, $$1, $$2, $$3, uh.a, $$7, o);
      this.y = $$4;
      this.A = $$6;
      this.z = $$5;
   }

   @Nullable
   public eoq.b a() {
      return this.B;
   }

   public void b() {
      eno $$0 = this.y.get();
      if ($$0 != null) {
         env $$1 = $$0.i.get(this.A);
         boolean $$2 = this.A == 4;
         boolean $$3;
         String $$4;
         long $$5;
         String $$6;
         boolean $$7;
         if ($$2) {
            $$3 = $$0.m == eno.d.b;
            $$4 = x.getString();
            $$5 = (long)$$0.p;
            $$6 = $$0.q;
            $$7 = $$0.p == -1;
         } else {
            $$3 = $$0.n == this.A && $$0.m != eno.d.b;
            $$4 = $$1.a(this.A);
            $$5 = $$1.j;
            $$6 = $$1.k;
            $$7 = $$1.l;
         }

         eoq.a $$13 = a($$0, $$3, $$2);
         Pair<ui, ui> $$14 = this.a($$0, $$4, $$7, $$2, $$13);
         this.B = new eoq.b($$3, $$4, $$5, $$6, $$7, $$2, $$13, (ui)$$14.getFirst());
         this.b((ui)$$14.getSecond());
      }
   }

   private static eoq.a a(eno $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if (!$$0.j && $$0.e != eno.c.c) {
            return eoq.a.c;
         }
      } else {
         if (!$$2) {
            return eoq.a.b;
         }

         if (!$$0.j) {
            return eoq.a.b;
         }
      }

      return eoq.a.a;
   }

   private Pair<ui, ui> a(eno $$0, String $$1, boolean $$2, boolean $$3, eoq.a $$4) {
      if ($$4 == eoq.a.a) {
         return Pair.of(null, ui.b($$1));
      } else {
         ui $$5;
         if ($$3) {
            if ($$2) {
               $$5 = uh.a;
            } else {
               $$5 = uh.a().f($$1).b(uh.u).f($$0.o);
            }
         } else {
            $$5 = uh.a().f($$1);
         }

         ui $$8;
         if ($$4 == eoq.a.c) {
            $$8 = u;
         } else {
            $$8 = $$3 ? v : w;
         }

         ui $$10 = $$8.f().b($$5);
         return Pair.of($$8, $$10);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         this.a($$0, this.p(), this.r(), $$1, $$2, this.B.d, this.B.e, this.A, this.B.f, this.B.g, this.B.a, this.B.b, this.B.c, this.B.h);
      }
   }

   private void a(
      esy $$0,
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
      eoq.a $$12,
      @Nullable ui $$13
   ) {
      boolean $$14 = this.n();
      if (this.a_((double)$$3, (double)$$4) && $$13 != null) {
         this.z.accept($$13);
      }

      ero $$15 = ero.O();
      afw $$16;
      if ($$11) {
         $$16 = eqd.a(String.valueOf($$8), $$9);
      } else if ($$10) {
         $$16 = a;
      } else if ($$9 != null && $$8 != -1L) {
         $$16 = eqd.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$16 = b;
      } else if ($$7 == 2) {
         $$16 = c;
      } else if ($$7 == 3) {
         $$16 = d;
      } else {
         $$16 = a;
      }

      if ($$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a($$16, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      boolean $$23 = $$14 && $$12 != eoq.a.a;
      if ($$23) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else if ($$5) {
         $$0.a(0.8F, 0.8F, 0.8F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(s, $$1, $$2, 80, 80);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if ($$5) {
         this.a($$0, $$1, $$2);
      }

      $$0.a($$15.h, $$6, $$1 + 40, $$2 + 66, -1);
   }

   private void a(esy $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(t, $$1 + 67, $$2 + 4, 9, 8);
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
      public final eoq.a c;
      @Nullable
      final ui h;

      b(boolean $$0, String $$1, long $$2, @Nullable String $$3, boolean $$4, boolean $$5, eoq.a $$6, @Nullable ui $$7) {
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
