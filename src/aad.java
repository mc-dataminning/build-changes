import java.util.Objects;
import javax.annotation.Nullable;

public class aad implements va<ws> {
   private final String a;
   @Nullable
   private final String b;
   private final int c;
   private final afl.a d;

   public aad(afl.a $$0, @Nullable String $$1, String $$2, int $$3) {
      if ($$0 != afl.a.b && $$1 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.a = $$2;
         this.b = $$1;
         this.c = $$3;
         this.d = $$0;
      }
   }

   public aad(sl $$0) {
      this.a = $$0.r();
      this.d = $$0.b(afl.a.class);
      String $$1 = $$0.r();
      this.b = Objects.equals($$1, "") ? null : $$1;
      if (this.d != afl.a.b) {
         this.c = $$0.m();
      } else {
         this.c = 0;
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.d);
      $$0.a(this.b == null ? "" : this.b);
      if (this.d != afl.a.b) {
         $$0.c(this.c);
      }
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public afl.a f() {
      return this.d;
   }
}
