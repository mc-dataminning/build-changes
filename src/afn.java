import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class afn implements yb<aez> {
   public static final xs<vf, afn> a = yb.a(afn::a, afn::new);
   private static final int b = 128;
   private static final xs<vf, Int2ObjectMap<cqk>> c = xq.a(uu.a(Int2ObjectOpenHashMap::new, 128), xq.c.a(Short::intValue, Integer::shortValue), cqk.f);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final clx h;
   private final cqk i;
   private final Int2ObjectMap<cqk> j;

   public afn(int $$0, int $$1, int $$2, int $$3, clx $$4, cqk $$5, Int2ObjectMap<cqk> $$6) {
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
      this.h = $$0.b(clx.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cqk.f.decode($$0);
   }

   private void a(vf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cqk.f.encode($$0, this.i);
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

   public cqk g() {
      return this.i;
   }

   public Int2ObjectMap<cqk> h() {
      return this.j;
   }

   public clx i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
