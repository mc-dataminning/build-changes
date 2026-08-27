import java.util.Arrays;

public class euu extends eui {
   private eqd c;

   private static enq<?>[] a(enr $$0) {
      return new enq[]{$$0.R(), $$0.S()};
   }

   public euu(euq $$0, enr $$1) {
      super($$0, $$1, sw.c("options.sounds.title"));
   }

   @Override
   protected void b() {
      this.c = new eqd(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(ami.a));
      this.c.a(this.l());
      this.c.a(this.b.ao());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(epi.a(sv.d, $$0 -> {
         this.f.m.aq();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private enq<?>[] l() {
      return Arrays.stream(ami.values()).filter($$0 -> $$0 != ami.a).map($$0 -> this.b.b($$0)).toArray(enq[]::new);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }
}
