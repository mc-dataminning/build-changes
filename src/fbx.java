import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fbx extends fbw<fji.a> {
   private static final int s = 120;
   private static final tf t = tf.c("gui.chatReport.title");
   private static final tf u = tf.c("gui.chatReport.select_chat");
   private final evt v = evt.d().a(8);
   private esy w;
   private esg x;
   private esg y;
   private esg z;

   private fbx(eya $$0, fjp $$1, fji.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fbx(eya $$0, fjp $$1, UUID $$2) {
      this($$0, $$1, new fji.a($$2, $$1.a().b()));
   }

   public fbx(eya $$0, fjp $$1, fji $$2) {
      this($$0, $$1, new fji.a($$2, $$1.a().b()));
   }

   @Override
   protected void aC_() {
      this.v.c().b();
      this.v.a(new etm(this.e, this.i));
      this.y = this.v.a(esg.a(u, $$0x -> this.f.a(new fbz(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = esg.a(c, $$0x -> this.f.a(new fcc(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(evl.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(evl.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      evt $$0 = this.v.a(evt.e().a(8));
      $$0.a(esg.a(te.k, $$0x -> this.at_()).a(120).a());
      this.x = $$0.a(esg.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         ese var10000 = this.d($$1);
      });
      this.b();
      this.C();
   }

   @Override
   protected void b() {
      this.v.a();
      evn.a(this.v, this.s());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(tf.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fjn $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fjl.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fjl.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
