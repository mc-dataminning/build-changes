import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agw implements yw<agg> {
   public static final yn<wa, agw> a = yw.a(agw::a, agw::new);
   private static final int b = 128;
   private static final yn<wa, Int2ObjectMap<cwp>> c = yl.a(Int2ObjectOpenHashMap::new, yl.e.a(Short::intValue, Integer::shortValue), cwp.g, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final csn h;
   private final cwp i;
   private final Int2ObjectMap<cwp> j;

   public agw(int $$0, int $$1, int $$2, int $$3, csn $$4, cwp $$5, Int2ObjectMap<cwp> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agw(wa $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(csn.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cwp.g.decode($$0);
   }

   private void a(wa $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cwp.g.encode($$0, this.i);
   }

   @Override
   public yy<agw> a() {
      return age.bz;
   }

   public void a(agg $$0) {
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

   public cwp g() {
      return this.i;
   }

   public Int2ObjectMap<cwp> h() {
      return this.j;
   }

   public csn i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
