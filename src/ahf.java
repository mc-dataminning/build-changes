import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahf implements zf<agp> {
   public static final yw<wj, ahf> a = zf.a(ahf::a, ahf::new);
   private static final int b = 128;
   private static final yw<wj, Int2ObjectMap<czk>> c = yu.a(Int2ObjectOpenHashMap::new, yu.e.a(Short::intValue, Integer::shortValue), czk.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cvn h;
   private final czk i;
   private final Int2ObjectMap<czk> j;

   public ahf(int $$0, int $$1, int $$2, int $$3, cvn $$4, czk $$5, Int2ObjectMap<czk> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahf(wj $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cvn.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = czk.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      czk.h.encode($$0, this.i);
   }

   @Override
   public zh<ahf> a() {
      return agn.bz;
   }

   public void a(agp $$0) {
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

   public czk g() {
      return this.i;
   }

   public Int2ObjectMap<czk> h() {
      return this.j;
   }

   public cvn i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
