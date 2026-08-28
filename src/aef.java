import java.util.Set;

public record aef(int b, byh c, Set<byi> d) implements zh<abw> {
   public static final yy<vw, aef> a = yy.a(yw.h, aef::b, byh.a, aef::e, byi.m, aef::f, aef::new);

   public static aef a(int $$0, byh $$1, Set<byi> $$2) {
      return new aef($$0, $$1, $$2);
   }

   @Override
   public zj<aef> a() {
      return agp.ai;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public byh e() {
      return this.c;
   }

   public Set<byi> f() {
      return this.d;
   }
}
