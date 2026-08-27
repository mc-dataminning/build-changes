import java.util.Arrays;
import java.util.stream.Stream;

public class euf extends eui {
   private eqd c;

   private static enq<?>[] a(enr $$0) {
      return new enq[]{$$0.c(), $$0.M(), $$0.B(), $$0.N(), $$0.U()};
   }

   public euf(euq $$0, enr $$1) {
      super($$0, $$1, sw.c("options.mouse_settings.title"));
   }

   @Override
   protected void b() {
      this.c = new eqd(this.f, this.g, this.h, 32, this.h - 32, 25);
      if (ehe.a()) {
         this.c.a(Stream.concat(Arrays.stream(a(this.b)), Stream.of(this.b.C())).toArray(enq[]::new));
      } else {
         this.c.a(a(this.b));
      }

      this.e(this.c);
      this.d(epi.a(sv.d, $$0 -> {
         this.b.aq();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 5, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }
}
