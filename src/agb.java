import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agb implements yp<afn> {
   public static final yg<vt, agb> a = yp.a(agb::a, agb::new);
   private static final int b = 128;
   private static final yg<vt, Int2ObjectMap<crs>> c = ye.a(Int2ObjectOpenHashMap::new, ye.d.a(Short::intValue, Integer::shortValue), crs.e, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cnf h;
   private final crs i;
   private final Int2ObjectMap<crs> j;

   public agb(int $$0, int $$1, int $$2, int $$3, cnf $$4, crs $$5, Int2ObjectMap<crs> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agb(vt $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cnf.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = crs.e.decode($$0);
   }

   private void a(vt $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      crs.e.encode($$0, this.i);
   }

   @Override
   public yr<agb> a() {
      return afl.bq;
   }

   public void a(afn $$0) {
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

   public crs g() {
      return this.i;
   }

   public Int2ObjectMap<crs> h() {
      return this.j;
   }

   public cnf i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
