import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agv implements yw<agf> {
   public static final yn<wa, agv> a = yw.a(agv::a, agv::new);
   private static final int b = 128;
   private static final yn<wa, Int2ObjectMap<cxh>> c = yl.a(Int2ObjectOpenHashMap::new, yl.e.a(Short::intValue, Integer::shortValue), cxh.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cth h;
   private final cxh i;
   private final Int2ObjectMap<cxh> j;

   public agv(int $$0, int $$1, int $$2, int $$3, cth $$4, cxh $$5, Int2ObjectMap<cxh> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agv(wa $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cth.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cxh.h.decode($$0);
   }

   private void a(wa $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cxh.h.encode($$0, this.i);
   }

   @Override
   public yy<agv> a() {
      return agd.by;
   }

   public void a(agf $$0) {
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

   public cxh g() {
      return this.i;
   }

   public Int2ObjectMap<cxh> h() {
      return this.j;
   }

   public cth i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
