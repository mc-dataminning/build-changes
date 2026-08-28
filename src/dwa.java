import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwa extends duq implements ecm.b<ect.b>, ect {
   private static final Logger a = LogUtils.getLogger();
   private ect.a b;
   private final ect.b c;
   private final ect.d d = this.b();
   private int h;

   protected dwa(dus<?> $$0, jh $$1, dxo $$2) {
      super($$0, $$1, $$2);
      this.b = new ect.a();
      this.c = new ect.b(this);
   }

   public dwa(jh $$0, dxo $$1) {
      this(dus.J, $$0, $$1);
   }

   public ect.d b() {
      return new dwa.a(this.aB_());
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      aln<vj> $$2 = $$1.a(va.a);
      if ($$0.b("listener", 10)) {
         ect.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      aln<vj> $$2 = $$1.a(va.a);
      ect.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ect.a gp() {
      return this.b;
   }

   @Override
   public ect.d gq() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ect.b f() {
      return this.c;
   }

   protected class a implements ect.d {
      public static final int b = 8;
      protected final jh c;
      private final eco a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new ecg($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eco b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arx $$0, jh $$1, jq<eck> $$2, @Nullable eck.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eck.f) && !$$2.a(eck.i) ? drb.q(dwa.this.m()) : false;
      }

      @Override
      public void a(arx $$0, jh $$1, jq<eck> $$2, @Nullable bvb $$3, @Nullable bvb $$4, float $$5) {
         dxo $$6 = dwa.this.m();
         if (drb.q($$6)) {
            dwa.this.a(ect.a_($$2));
            int $$7 = ect.a_($$5, this.a());
            if ($$6.b() instanceof drb $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dwa.this.d());
            }
         }
      }

      @Override
      public void e() {
         dwa.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
