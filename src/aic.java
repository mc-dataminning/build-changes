import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class aic implements aac<ahm> {
   public static final zt<xg, aic> a = aac.a(aic::a, aic::new);
   private static final int b = 128;
   private static final zt<xg, Int2ObjectMap<cxp>> c = zr.a(Int2ObjectOpenHashMap::new, zr.e.a(Short::intValue, Integer::shortValue), cxp.g, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final ctn h;
   private final cxp i;
   private final Int2ObjectMap<cxp> j;

   public aic(int $$0, int $$1, int $$2, int $$3, ctn $$4, cxp $$5, Int2ObjectMap<cxp> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private aic(xg $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(ctn.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cxp.g.decode($$0);
   }

   private void a(xg $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cxp.g.encode($$0, this.i);
   }

   @Override
   public aae<aic> a() {
      return ahk.bz;
   }

   public void a(ahm $$0) {
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

   public cxp g() {
      return this.i;
   }

   public Int2ObjectMap<cxp> h() {
      return this.j;
   }

   public ctn i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
