import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhu extends dgo implements dnm.b<dnt.b>, dnt {
   private static final Logger b = LogUtils.getLogger();
   private dnt.a c;
   private final dnt.b d;
   private final dnt.d e = this.c();
   private int g;

   protected dhu(dgq<?> $$0, hx $$1, dja $$2) {
      super($$0, $$1, $$2);
      this.c = new dnt.a();
      this.d = new dnt.b(this);
   }

   public dhu(hx $$0, dja $$1) {
      this(dgq.I, $$0, $$1);
   }

   public dnt.d c() {
      return new dhu.a(this.aB_());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dnt.a.a.parse(new Dynamic(sz.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dnt.a.a.encodeStart(sz.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dnt.a gg() {
      return this.c;
   }

   @Override
   public dnt.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dnt.b g() {
      return this.d;
   }

   protected class a implements dnt.d {
      public static final int b = 8;
      protected final hx c;
      private final dno a;

      public a(hx $$1) {
         this.c = $$1;
         this.a = new dng($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dno b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(amz $$0, hx $$1, dnk $$2, @Nullable dnk.a $$3) {
         return !$$1.equals(this.c) || $$2 != dnk.f && $$2 != dnk.i ? ddb.n(dhu.this.r()) : false;
      }

      @Override
      public void a(amz $$0, hx $$1, dnk $$2, @Nullable blp $$3, @Nullable blp $$4, float $$5) {
         dja $$6 = dhu.this.r();
         if (ddb.n($$6)) {
            dhu.this.a(dnt.a_($$2));
            int $$7 = dnt.a_($$5, this.a());
            if ($$6.b() instanceof ddb $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dhu.this.f());
            }
         }
      }

      @Override
      public void e() {
         dhu.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
