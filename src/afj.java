import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class afj implements xz<aev> {
   public static final xq<vd, afj> a = xz.a(afj::a, afj::new);
   private static final int b = 128;
   private static final xq<vd, Int2ObjectMap<cpq>> c = xo.a(us.a(Int2ObjectOpenHashMap::new, 128), xo.c.a(Short::intValue, Integer::shortValue), cpq.f);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cld h;
   private final cpq i;
   private final Int2ObjectMap<cpq> j;

   public afj(int $$0, int $$1, int $$2, int $$3, cld $$4, cpq $$5, Int2ObjectMap<cpq> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private afj(vd $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cld.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cpq.f.decode($$0);
   }

   private void a(vd $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cpq.f.encode($$0, this.i);
   }

   @Override
   public yb<afj> a() {
      return aet.bq;
   }

   public void a(aev $$0) {
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

   public cpq g() {
      return this.i;
   }

   public Int2ObjectMap<cpq> h() {
      return this.j;
   }

   public cld i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
