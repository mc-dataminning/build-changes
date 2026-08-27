import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agl implements yz<afx> {
   public static final yq<wd, agl> a = yz.a(agl::a, agl::new);
   private static final int b = 128;
   private static final yq<wd, Int2ObjectMap<csd>> c = yo.a(Int2ObjectOpenHashMap::new, yo.d.a(Short::intValue, Integer::shortValue), csd.e, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cnq h;
   private final csd i;
   private final Int2ObjectMap<csd> j;

   public agl(int $$0, int $$1, int $$2, int $$3, cnq $$4, csd $$5, Int2ObjectMap<csd> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agl(wd $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cnq.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = csd.e.decode($$0);
   }

   private void a(wd $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      csd.e.encode($$0, this.i);
   }

   @Override
   public zb<agl> a() {
      return afv.bq;
   }

   public void a(afx $$0) {
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

   public csd g() {
      return this.i;
   }

   public Int2ObjectMap<csd> h() {
      return this.j;
   }

   public cnq i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
