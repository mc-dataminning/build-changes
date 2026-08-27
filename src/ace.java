import javax.annotation.Nullable;

public class ace implements wk<yd> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final int d;
   private final bjt e;
   private final byte f;
   private final int g;
   private final byte h;
   @Nullable
   private final bjv.a i;

   public ace(int $$0, bjv $$1) {
      this.d = $$0;
      this.e = $$1.c();
      this.f = (byte)($$1.e() & 0xFF);
      this.g = $$1.d();
      byte $$2 = 0;
      if ($$1.f()) {
         $$2 = (byte)($$2 | 1);
      }

      if ($$1.g()) {
         $$2 = (byte)($$2 | 2);
      }

      if ($$1.h()) {
         $$2 = (byte)($$2 | 4);
      }

      this.h = $$2;
      this.i = $$1.a().orElse(null);
   }

   public ace(tu $$0) {
      this.d = $$0.n();
      this.e = $$0.a(jy.e);
      this.f = $$0.readByte();
      this.g = $$0.n();
      this.h = $$0.readByte();
      this.i = $$0.c($$0x -> $$0x.a(sn.a, bjv.a.a));
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.d);
      $$0.a(jy.e, this.e);
      $$0.k(this.f);
      $$0.c(this.g);
      $$0.k(this.h);
      $$0.a(this.i, ($$0x, $$1) -> $$0x.a(sn.a, bjv.a.a, $$1));
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.d;
   }

   public bjt d() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }

   public int f() {
      return this.g;
   }

   public boolean g() {
      return (this.h & 2) == 2;
   }

   public boolean h() {
      return (this.h & 1) == 1;
   }

   public boolean i() {
      return (this.h & 4) == 4;
   }

   @Nullable
   public bjv.a j() {
      return this.i;
   }
}
