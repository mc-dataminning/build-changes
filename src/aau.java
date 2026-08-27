import javax.annotation.Nullable;

public class aau implements va<ws> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final int d;
   private final bhw e;
   private final byte f;
   private final int g;
   private final byte h;
   @Nullable
   private final bhy.a i;

   public aau(int $$0, bhy $$1) {
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

   public aau(sl $$0) {
      this.d = $$0.m();
      this.e = $$0.a(jd.e);
      this.f = $$0.readByte();
      this.g = $$0.m();
      this.h = $$0.readByte();
      this.i = $$0.c($$0x -> $$0x.a(rf.a, bhy.a.a));
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.d);
      $$0.a(jd.e, this.e);
      $$0.k(this.f);
      $$0.c(this.g);
      $$0.k(this.h);
      $$0.a(this.i, ($$0x, $$1) -> $$0x.a(rf.a, bhy.a.a, $$1));
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.d;
   }

   public bhw d() {
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
   public bhy.a j() {
      return this.i;
   }
}
