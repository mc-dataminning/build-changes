import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ent extends esl {
   private static final aeu s = new aeu("widget/slot_frame");
   private static final aeu t = new aeu("icon/checkmark");
   public static final aeu a = new aeu("textures/gui/realms/empty_frame.png");
   public static final aeu b = new aeu("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final aeu c = new aeu("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final aeu d = new aeu("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final ti u = ti.c("mco.configure.world.slot.tooltip.active");
   private static final ti v = ti.c("mco.configure.world.slot.tooltip.minigame");
   private static final ti w = ti.c("mco.configure.world.slot.tooltip");
   private static final ti x = ti.c("mco.worldSlot.minigame");
   private final Supplier<emr> y;
   private final Consumer<ti> z;
   private final int A;
   @Nullable
   private ent.b B;

   public ent(int $$0, int $$1, int $$2, int $$3, Supplier<emr> $$4, Consumer<ti> $$5, int $$6, esl.c $$7) {
      super($$0, $$1, $$2, $$3, th.a, $$7, o);
      this.y = $$4;
      this.A = $$6;
      this.z = $$5;
   }

   @Nullable
   public ent.b a() {
      return this.B;
   }

   public void b() {
      emr $$0 = this.y.get();
      if ($$0 != null) {
         emy $$1 = $$0.i.get(this.A);
         boolean $$2 = this.A == 4;
         boolean $$3;
         String $$4;
         long $$5;
         String $$6;
         boolean $$7;
         if ($$2) {
            $$3 = $$0.m == emr.c.b;
            $$4 = x.getString();
            $$5 = (long)$$0.p;
            $$6 = $$0.q;
            $$7 = $$0.p == -1;
         } else {
            $$3 = $$0.n == this.A && $$0.m != emr.c.b;
            $$4 = $$1.a(this.A);
            $$5 = $$1.j;
            $$6 = $$1.k;
            $$7 = $$1.l;
         }

         ent.a $$13 = a($$0, $$3, $$2);
         Pair<ti, ti> $$14 = this.a($$0, $$4, $$7, $$2, $$13);
         this.B = new ent.b($$3, $$4, $$5, $$6, $$7, $$2, $$13, (ti)$$14.getFirst());
         this.b((ti)$$14.getSecond());
      }
   }

   private static ent.a a(emr $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if (!$$0.j && $$0.e != emr.b.c) {
            return ent.a.c;
         }
      } else {
         if (!$$2) {
            return ent.a.b;
         }

         if (!$$0.j) {
            return ent.a.b;
         }
      }

      return ent.a.a;
   }

   private Pair<ti, ti> a(emr $$0, String $$1, boolean $$2, boolean $$3, ent.a $$4) {
      if ($$4 == ent.a.a) {
         return Pair.of(null, ti.b($$1));
      } else {
         ti $$5;
         if ($$3) {
            if ($$2) {
               $$5 = th.a;
            } else {
               $$5 = th.a().f($$1).b(th.u).f($$0.o);
            }
         } else {
            $$5 = th.a().f($$1);
         }

         ti $$8;
         if ($$4 == ent.a.c) {
            $$8 = u;
         } else {
            $$8 = $$3 ? v : w;
         }

         ti $$10 = $$8.e().b($$5);
         return Pair.of($$8, $$10);
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         this.a($$0, this.r(), this.t(), $$1, $$2, this.B.d, this.B.e, this.A, this.B.f, this.B.g, this.B.a, this.B.b, this.B.c, this.B.h);
      }
   }

   private void a(
      esa $$0,
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
      ent.a $$12,
      @Nullable ti $$13
   ) {
      boolean $$14 = this.o();
      if (this.a_((double)$$3, (double)$$4) && $$13 != null) {
         this.z.accept($$13);
      }

      eqq $$15 = eqq.O();
      aeu $$16;
      if ($$11) {
         $$16 = epg.a(String.valueOf($$8), $$9);
      } else if ($$10) {
         $$16 = a;
      } else if ($$9 != null && $$8 != -1L) {
         $$16 = epg.a(String.valueOf($$8), $$9);
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
      boolean $$23 = $$14 && $$12 != ent.a.a;
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

   private void a(esa $$0, int $$1, int $$2) {
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
      public final ent.a c;
      @Nullable
      final ti h;

      b(boolean $$0, String $$1, long $$2, @Nullable String $$3, boolean $$4, boolean $$5, ent.a $$6, @Nullable ti $$7) {
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
