import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class afn implements yb<aez> {
   public static final xs<vf, afn> a = yb.a(afn::a, afn::new);
   private static final int b = 128;
   private static final xs<vf, Int2ObjectMap<cqm>> c = xq.a(uu.a(Int2ObjectOpenHashMap::new, 128), xq.c.a(Short::intValue, Integer::shortValue), cqm.f);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final clz h;
   private final cqm i;
   private final Int2ObjectMap<cqm> j;

   public afn(int $$0, int $$1, int $$2, int $$3, clz $$4, cqm $$5, Int2ObjectMap<cqm> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private afn(vf $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(clz.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cqm.f.decode($$0);
   }

   private void a(vf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cqm.f.encode($$0, this.i);
   }

   @Override
   public yd<afn> a() {
      return aex.bq;
   }

   public void a(aez $$0) {
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

   public cqm g() {
      return this.i;
   }

   public Int2ObjectMap<cqm> h() {
      return this.j;
   }

   public clz i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
