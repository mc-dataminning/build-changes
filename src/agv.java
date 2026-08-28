import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agv implements yv<agf> {
   public static final ym<vz, agv> a = yv.a(agv::a, agv::new);
   private static final int b = 128;
   private static final ym<vz, Int2ObjectMap<cwn>> c = yk.a(Int2ObjectOpenHashMap::new, yk.e.a(Short::intValue, Integer::shortValue), cwn.g, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final csl h;
   private final cwn i;
   private final Int2ObjectMap<cwn> j;

   public agv(int $$0, int $$1, int $$2, int $$3, csl $$4, cwn $$5, Int2ObjectMap<cwn> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agv(vz $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(csl.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cwn.g.decode($$0);
   }

   private void a(vz $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cwn.g.encode($$0, this.i);
   }

   @Override
   public yx<agv> a() {
      return agd.bz;
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

   public cwn g() {
      return this.i;
   }

   public Int2ObjectMap<cwn> h() {
      return this.j;
   }

   public csl i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
