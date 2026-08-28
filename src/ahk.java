import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahk implements zo<agu> {
   public static final zf<ws, ahk> a = zo.a(ahk::a, ahk::new);
   private static final int b = 128;
   private static final zf<ws, Int2ObjectMap<cvx>> c = zd.a(Int2ObjectOpenHashMap::new, zd.e.a(Short::intValue, Integer::shortValue), cvx.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cru h;
   private final cvx i;
   private final Int2ObjectMap<cvx> j;

   public ahk(int $$0, int $$1, int $$2, int $$3, cru $$4, cvx $$5, Int2ObjectMap<cvx> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahk(ws $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cru.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cvx.h.decode($$0);
   }

   private void a(ws $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cvx.h.encode($$0, this.i);
   }

   @Override
   public zq<ahk> a() {
      return ags.bv;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.g;
   }

   public cvx g() {
      return this.i;
   }

   public Int2ObjectMap<cvx> h() {
      return this.j;
   }

   public cru i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
