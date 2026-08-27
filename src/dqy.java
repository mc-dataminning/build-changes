import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dqy extends dpv implements bqm {
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 2;
   public static final int i = 3;
   public static final int j = 4;
   public static final int k = 5;
   public static final int l = 6;
   short v;
   public static final char m = 'a';
   public static final char q = 'j';
   public static final char r = 'a';
   public static final char s = 'p';
   public static final int t = 200;
   char w;
   char x;
   char y;
   boolean z;
   short A;
   private jj<cuh> B = jj.a(3, cuh.i);
   private static final int[] C = new int[]{0};
   private static final int[] D = new int[]{1};
   protected final cpq u = new cpq() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dqy.this.v;
            case 1 -> dqy.this.w;
            case 2 -> dqy.this.x;
            case 3 -> dqy.this.y;
            case 4 -> dqy.this.A;
            case 5 -> dqy.this.z ? 1 : 0;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqy.this.v = (short)$$1;
         }
      }

      @Override
      public int a() {
         return 6;
      }
   };

   public dqy(ir $$0, dtc $$1) {
      super(dqe.b, $$0, $$1);
   }

   @Override
   protected xe k() {
      return xe.c("container.fletching");
   }

   @Override
   protected jj<cuh> j() {
      return this.B;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.B = $$0;
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return new cqb($$0, $$1, this, this.u);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.B = jj.a(this.b(), cuh.i);
      bpu.b($$0, this.B, $$1);
      this.w = $$0.l("quality").charAt(0);
      this.x = $$0.l("impurities").charAt(0);
      this.y = $$0.l("nextLevelImpurities").charAt(0);
      this.A = $$0.g("processsTime");
      this.z = $$0.q("explored");
      this.v = $$0.g("progresss");
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("progresss", this.v);
      $$0.a("quality", String.valueOf(this.w));
      $$0.a("impurities", String.valueOf(this.x));
      $$0.a("nextLevelImpurities", String.valueOf(this.y));
      $$0.a("processsTime", this.A);
      $$0.a("explored", this.z);
      bpu.a($$0, this.B, $$1);
   }

   @Override
   public void a(ka $$0) {
      super.a($$0);
      dqy.a $$1 = $$0.a(ke.L, dqy.a.c);
      this.w = $$1.a();
      this.x = $$1.b();
      this.y = $$1.c();
      this.A = $$1.d();
      this.z = $$1.e();
   }

   @Override
   public void a(ka.a $$0) {
      super.a($$0);
      $$0.a(ke.L, new dqy.a(this.w, this.x, this.y, this.A, this.z));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("quality");
      $$0.r("impurities");
      $$0.r("nextLevelImpurities");
      $$0.r("processsTime");
      $$0.r("explored");
   }

   @Override
   public int b() {
      return this.B.size();
   }

   @Override
   public int[] a(iw $$0) {
      return $$0 == iw.a ? D : C;
   }

   @Override
   public boolean b(int $$0, cuh $$1) {
      if ($$0 == 1) {
         return false;
      } else if ($$0 == 0) {
         return this.A == 0 ? false : a($$1, this.w, this.x);
      } else {
         return $$0 != 2 ? true : this.v == 0 && $$1.a(cuk.qM);
      }
   }

   public static boolean a(cuh $$0, char $$1, char $$2) {
      if (!$$0.a(cuk.pT)) {
         return false;
      } else {
         dqy.b $$3 = $$0.a().a(ke.M);
         if ($$3 == null) {
            throw new IllegalStateException("Resin item without resin quality");
         } else {
            return $$1 == $$3.a() && $$3.b() == $$2;
         }
      }
   }

   public static cuh a(char $$0, char $$1) {
      if ($$0 > 'j') {
         return new cuh(cuk.pR);
      } else {
         cuh $$2 = new cuh(cuk.pT);
         $$2.b(ke.M, new dqy.b($$0, $$1));
         return $$2;
      }
   }

   @Override
   public boolean a(int $$0, cuh $$1, @Nullable iw $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuh $$1, iw $$2) {
      return $$0 != 0;
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dqy $$3) {
      if ($$3.A == 0) {
         $$3.A = (short)$$0.A.b(10, 200);
         int $$4 = 10;
         $$3.w = (char)(97 + $$0.A.a(10));
         $$3.x = dqy.b.a($$0.F_());
         $$3.y = dqy.b.a($$0.F_());
         $$3.z = false;
      }

      cuh $$5 = $$3.B.get(1);
      if ($$5.d() || $$5.G() != $$5.i()) {
         if ($$3.v > 0) {
            $$3.v--;
            if ($$3.v <= 0) {
               cuh $$6 = a((char)($$3.w + 1), $$3.y);
               if (!$$5.d()) {
                  $$6.e($$5.G() + 1);
               }

               $$3.B.set(2, cuk.qM.v());
               $$3.B.set(1, $$6);
               $$3.z = true;
               a($$0, $$1, $$2);
            }
         }

         cuh $$7 = $$3.B.get(0);
         if (!$$7.d()) {
            if ($$3.v <= 0 && $$3.B.get(2).a(cuk.qM)) {
               $$3.B.set(2, cuh.i);
               $$3.v = $$3.A;
               $$7.h(1);
               a($$0, $$1, $$2);
            }
         }
      }
   }

   public static final class a implements cxx {
      public static final Codec<dqy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.t.fieldOf("quality").forGetter(dqy.a::a),
                  axu.t.fieldOf("impurities").forGetter(dqy.a::b),
                  axu.t.fieldOf("next_level_impurities").forGetter(dqy.a::c),
                  Codec.SHORT.fieldOf("processs_time").forGetter(dqy.a::d),
                  Codec.BOOL.optionalFieldOf("explored", false).forGetter(dqy.a::e)
               )
               .apply($$0, dqy.a::new)
      );
      public static final zc<ByteBuf, dqy.a> b = zc.a(za.e, dqy.a::a, za.e, dqy.a::b, za.e, dqy.a::c, za.d, dqy.a::d, za.b, dqy.a::e, dqy.a::new);
      public static final dqy.a c = new dqy.a('a', 'a', 'a', (short)0, false);
      private final char d;
      private final char e;
      private final char f;
      private final short g;
      private final boolean h;

      public a(char $$0, char $$1, char $$2, short $$3, boolean $$4) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public char a() {
         return this.d;
      }

      public char b() {
         return this.e;
      }

      public char c() {
         return this.f;
      }

      public short d() {
         return this.g;
      }

      public boolean e() {
         return this.h;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else if ($$0 != null && $$0.getClass() == this.getClass()) {
            dqy.a $$1 = (dqy.a)$$0;
            return this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.g == $$1.g && this.h == $$1.h;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.d, this.e, this.f, this.g, this.h);
      }

      @Override
      public String toString() {
         return "Fletching[quality="
            + this.d
            + ", impurities="
            + this.e
            + ", nextLevelImpurities="
            + this.f
            + ", processsTime="
            + this.g
            + ", explored="
            + this.h
            + "]";
      }

      @Override
      public void a(Consumer<xe> $$0, cwi $$1) {
         $$0.accept(xe.c("block.minecraft.fletching_table.from"));
         $$0.accept(xd.a().a(dqy.b.a(this.d)).a(n.h));
         $$0.accept(xd.a().a(dqy.b.a(Character.valueOf(this.e))).a(n.h));
         $$0.accept(xe.c("block.minecraft.fletching_table.to"));
         $$0.accept(xd.a().a(this.d >= 'j' ? xe.c("item.minecraft.amber_gem").a(n.g) : dqy.b.a(!this.h ? "unknown" : this.f).a(n.h)));
      }
   }

   public static final class b implements cxx {
      public static final Codec<dqy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.t.fieldOf("quality").forGetter(dqy.b::a), axu.t.fieldOf("impurities").forGetter(dqy.b::b)).apply($$0, dqy.b::new)
      );
      public static final zc<ByteBuf, dqy.b> b = zc.a(za.e, dqy.b::a, za.e, dqy.b::b, dqy.b::new);
      public static final dqy.b c = new dqy.b('a', 'a');
      private final char d;
      private final char e;

      public b(char $$0, char $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public void a(Consumer<xe> $$0, cwi $$1) {
         $$0.accept(a(this.d).a(n.h));
         $$0.accept(a(Character.valueOf(this.e)).a(n.h));
      }

      public static xs a(char $$0) {
         return xe.a("item.resin.quality", xe.c("item.resin.clarity.adjective." + $$0));
      }

      public static xs a(Object $$0) {
         return xe.a("item.resin.impurities", xe.c("item.resin.impurity.adjective." + $$0));
      }

      public char a() {
         return this.d;
      }

      public char b() {
         return this.e;
      }

      public static char a(ayt $$0) {
         int $$1 = 16;
         return (char)(97 + $$0.a(16));
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof dqy.b $$1) ? false : this.d == $$1.d && this.e == $$1.e;
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.d, this.e);
      }
   }
}
