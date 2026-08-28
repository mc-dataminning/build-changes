import javax.annotation.Nullable;

public abstract class ady implements zs<ace> {
   protected final int a;
   protected final short b;
   protected final short c;
   protected final short d;
   protected final byte e;
   protected final byte f;
   protected final boolean g;
   protected final boolean h;
   protected final boolean i;

   protected ady(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6, boolean $$7, boolean $$8) {
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
   public abstract zu<? extends ady> a();

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   @Nullable
   public bsp a(dbt $$0) {
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

   public byte g() {
      return this.e;
   }

   public byte h() {
      return this.f;
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

   public static class a extends ady {
      public static final zj<wl, ady.a> j = zs.a(ady.a::b, ady.a::a);

      public a(int $$0, short $$1, short $$2, short $$3, boolean $$4) {
         super($$0, $$1, $$2, $$3, (byte)0, (byte)0, $$4, false, true);
      }

      private static ady.a a(wl $$0) {
         int $$1 = $$0.l();
         short $$2 = $$0.readShort();
         short $$3 = $$0.readShort();
         short $$4 = $$0.readShort();
         boolean $$5 = $$0.readBoolean();
         return new ady.a($$1, $$2, $$3, $$4, $$5);
      }

      private void b(wl $$0) {
         $$0.c(this.a);
         $$0.l(this.b);
         $$0.l(this.c);
         $$0.l(this.d);
         $$0.a(this.g);
      }

      @Override
      public zu<ady.a> a() {
         return agq.R;
      }
   }

   public static class b extends ady {
      public static final zj<wl, ady.b> j = zs.a(ady.b::b, ady.b::a);

      public b(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static ady.b a(wl $$0) {
         int $$1 = $$0.l();
         short $$2 = $$0.readShort();
         short $$3 = $$0.readShort();
         short $$4 = $$0.readShort();
         byte $$5 = $$0.readByte();
         byte $$6 = $$0.readByte();
         boolean $$7 = $$0.readBoolean();
         return new ady.b($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      private void b(wl $$0) {
         $$0.c(this.a);
         $$0.l(this.b);
         $$0.l(this.c);
         $$0.l(this.d);
         $$0.k(this.e);
         $$0.k(this.f);
         $$0.a(this.g);
      }

      @Override
      public zu<ady.b> a() {
         return agq.S;
      }
   }

   public static class c extends ady {
      public static final zj<wl, ady.c> j = zs.a(ady.c::b, ady.c::a);

      public c(int $$0, byte $$1, byte $$2, boolean $$3) {
         super($$0, (short)0, (short)0, (short)0, $$1, $$2, $$3, true, false);
      }

      private static ady.c a(wl $$0) {
         int $$1 = $$0.l();
         byte $$2 = $$0.readByte();
         byte $$3 = $$0.readByte();
         boolean $$4 = $$0.readBoolean();
         return new ady.c($$1, $$2, $$3, $$4);
      }

      private void b(wl $$0) {
         $$0.c(this.a);
         $$0.k(this.e);
         $$0.k(this.f);
         $$0.a(this.g);
      }

      @Override
      public zu<ady.c> a() {
         return agq.T;
      }
   }
}
