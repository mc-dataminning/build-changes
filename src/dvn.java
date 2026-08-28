import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvn {
   private final dfe a;
   private final jh b;
   private final boolean c;
   @Nullable
   private dvj d;
   @Nullable
   private dsm e;
   private boolean f;

   public dvn(dfe $$0, jh $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dvj a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dsm b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dfe c() {
      return this.a;
   }

   public jh d() {
      return this.b;
   }

   public static Predicate<dvn> a(Predicate<dvj> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
