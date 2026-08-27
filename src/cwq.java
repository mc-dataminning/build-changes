import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cwq {
   private final bqc[] b;
   private final cwq.a c;
   private final avr<cre> d;
   @Nullable
   protected String a;
   private final il.c<cwq> e = kr.f.f(this);

   @Nullable
   public static cwq c(int $$0) {
      return kr.f.a($$0);
   }

   protected cwq(cwq.a $$0, avr<cre> $$1, bqc[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bqc, crj> a(bqo $$0) {
      Map<bqc, crj> $$1 = Maps.newEnumMap(bqc.class);

      for (bqc $$2 : this.b) {
         crj $$3 = $$0.d($$2);
         if (!$$3.d()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public avr<cre> d() {
      return this.d;
   }

   public cwq.a e() {
      return this.c;
   }

   public int f() {
      return 1;
   }

   public int a() {
      return 1;
   }

   public int a(int $$0) {
      return 1 + $$0 * 10;
   }

   public int b(int $$0) {
      return this.a($$0) + 5;
   }

   public int a(int $$0, bot $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bqb<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cwq $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cwq $$0) {
      return this != $$0;
   }

   protected String g() {
      if (this.a == null) {
         this.a = ac.a("enchantment", kr.f.b(this));
      }

      return this.a;
   }

   public String h() {
      return this.g();
   }

   public wg d(int $$0) {
      wu $$1 = wg.c(this.h());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(wf.v).b(wg.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(crj $$0) {
      return $$0.f().n().a(this.d);
   }

   public void a(bqo $$0, bpv $$1, int $$2) {
   }

   public void b(bqo $$0, bpv $$1, int $$2) {
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean i() {
      return true;
   }

   public boolean j() {
      return true;
   }

   @Deprecated
   public il.c<cwq> k() {
      return this.e;
   }

   public static enum a {
      a(10),
      b(5),
      c(2),
      d(1);

      private final int e;

      private a(int $$0) {
         this.e = $$0;
      }

      public int a() {
         return this.e;
      }
   }
}
