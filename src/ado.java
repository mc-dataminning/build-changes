import javax.annotation.Nullable;

public abstract class ado implements zf<abu> {
   protected final int a;
   protected final short b;
   protected final short c;
   protected final short d;
   protected final byte e;
   protected final byte f;
   protected final boolean g;
   protected final boolean h;
   protected final boolean i;

   protected ado(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6, boolean $$7, boolean $$8) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
      this.i = $$8;
   }

   @Override
   public abstract zh<? extends ado> a();

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   @Nullable
   public bwi a(djm $$0) {
      return $$0.a(this.a);
   }

   public short b() {
      return this.b;
   }

   public short e() {
      return this.c;
   }

   public short f() {
      return this.d;
   }

   public float g() {
      return azm.a(this.e);
   }

   public float h() {
      return azm.a(this.f);
   }

   public boolean i() {
      return this.h;
   }

   public boolean j() {
      return this.i;
   }

   public boolean k() {
      return this.g;
   }

   public static class a extends ado {
      public static final yw<vu, ado.a> j = zf.a(ado.a::b, ado.a::a);

      public a(int $$0, short $$1, short $$2, short $$3, boolean $$4) {
         super($$0, $$1, $$2, $$3, (byte)0, (byte)0, $$4, false, true);
      }

      private static ado.a a(vu $$0) {
         int $$1 = $$0.l();
         short $$2 = $$0.readShort();
         short $$3 = $$0.readShort();
         short $$4 = $$0.readShort();
         boolean $$5 = $$0.readBoolean();
         return new ado.a($$1, $$2, $$3, $$4, $$5);
      }

      private void b(vu $$0) {
         $$0.c(this.a);
         $$0.m(this.b);
         $$0.m(this.c);
         $$0.m(this.d);
         $$0.a(this.g);
      }

      @Override
      public zh<ado.a> a() {
         return agn.R;
      }
   }

   public static class b extends ado {
      public static final yw<vu, ado.b> j = zf.a(ado.b::b, ado.b::a);

      public b(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static ado.b a(vu $$0) {
         int $$1 = $$0.l();
         short $$2 = $$0.readShort();
         short $$3 = $$0.readShort();
         short $$4 = $$0.readShort();
         byte $$5 = $$0.readByte();
         byte $$6 = $$0.readByte();
         boolean $$7 = $$0.readBoolean();
         return new ado.b($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      private void b(vu $$0) {
         $$0.c(this.a);
         $$0.m(this.b);
         $$0.m(this.c);
         $$0.m(this.d);
         $$0.l(this.e);
         $$0.l(this.f);
         $$0.a(this.g);
      }

      @Override
      public zh<ado.b> a() {
         return agn.S;
      }
   }

   public static class c extends ado {
      public static final yw<vu, ado.c> j = zf.a(ado.c::b, ado.c::a);

      public c(int $$0, byte $$1, byte $$2, boolean $$3) {
         super($$0, (short)0, (short)0, (short)0, $$1, $$2, $$3, true, false);
      }

      private static ado.c a(vu $$0) {
         int $$1 = $$0.l();
         byte $$2 = $$0.readByte();
         byte $$3 = $$0.readByte();
         boolean $$4 = $$0.readBoolean();
         return new ado.c($$1, $$2, $$3, $$4);
      }

      private void b(vu $$0) {
         $$0.c(this.a);
         $$0.l(this.e);
         $$0.l(this.f);
         $$0.a(this.g);
      }

      @Override
      public zh<ado.c> a() {
         return agn.U;
      }
   }
}
