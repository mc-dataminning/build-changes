import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class afg implements xx<aes> {
   public static final xo<vb, afg> a = xx.a(afg::a, afg::new);
   private static final int b = 128;
   private static final xo<vb, Int2ObjectMap<cpd>> c = xm.a(uq.a(Int2ObjectOpenHashMap::new, 128), xm.c.a(Short::intValue, Integer::shortValue), cpd.f);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cko h;
   private final cpd i;
   private final Int2ObjectMap<cpd> j;

   public afg(int $$0, int $$1, int $$2, int $$3, cko $$4, cpd $$5, Int2ObjectMap<cpd> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private afg(vb $$0) {
      this.d = $$0.readByte();
      this.e = $$0.n();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cko.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cpd.f.decode($$0);
   }

   private void a(vb $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cpd.f.encode($$0, this.i);
   }

   @Override
   public xz<afg> a() {
      return aeq.bp;
   }

   public void a(aes $$0) {
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

   public cpd g() {
      return this.i;
   }

   public Int2ObjectMap<cpd> h() {
      return this.j;
   }

   public cko i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
