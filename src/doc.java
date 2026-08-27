import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface doc {
   Codec<doc> b = dod.b;
   Codec<ih<doc>> c = agz.a(ke.ax, b);
   Codec<doc> d = c.xmap(dod.j::new, $$0 -> (ih)($$0 instanceof dod.j $$1 ? $$1.j() : new ih.a<>($$0)));

   double a(doc.b var1);

   void a(double[] var1, doc.a var2);

   doc a(doc.f var1);

   double a();

   double b();

   auc<? extends doc> c();

   default doc a(double $$0, double $$1) {
      return new dod.g(this, $$0, $$1);
   }

   default doc d() {
      return dod.a(this, dod.k.a.a);
   }

   default doc e() {
      return dod.a(this, dod.k.a.b);
   }

   default doc f() {
      return dod.a(this, dod.k.a.c);
   }

   default doc g() {
      return dod.a(this, dod.k.a.d);
   }

   default doc h() {
      return dod.a(this, dod.k.a.e);
   }

   default doc i() {
      return dod.a(this, dod.k.a.f);
   }

   public interface a {
      doc.b a(int var1);

      void a(double[] var1, doc var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dpl d() {
         return dpl.a();
      }
   }

   public static record c(ih<edn.a> b, @Nullable edn c) {
      public static final Codec<doc.c> a = edn.a.b.xmap($$0 -> new doc.c($$0, null), doc.c::b);

      public c(ih<edn.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends doc {
      @Override
      default void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default doc a(doc.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements doc.b {
   }

   public interface f {
      doc apply(doc var1);

      default doc.c a(doc.c $$0) {
         return $$0;
      }
   }
}
