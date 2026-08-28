import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agw implements yw<agg> {
   public static final yn<wa, agw> a = yw.a(agw::a, agw::new);
   private static final int b = 128;
   private static final yn<wa, Int2ObjectMap<cwo>> c = yl.a(Int2ObjectOpenHashMap::new, yl.e.a(Short::intValue, Integer::shortValue), cwo.g, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final csm h;
   private final cwo i;
   private final Int2ObjectMap<cwo> j;

   public agw(int $$0, int $$1, int $$2, int $$3, csm $$4, cwo $$5, Int2ObjectMap<cwo> $$6) {
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
      this.h = $$0.b(csm.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cwo.g.decode($$0);
   }

   private void a(wa $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cwo.g.encode($$0, this.i);
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

   public cwo g() {
      return this.i;
   }

   public Int2ObjectMap<cwo> h() {
      return this.j;
   }

   public csm i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
