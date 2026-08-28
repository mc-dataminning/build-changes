import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agq implements zb<agb> {
   public static final ys<wf, agq> a = zb.a(agq::a, agq::new);
   private static final int b = 128;
   private static final ys<wf, Int2ObjectMap<cud>> c = yq.a(Int2ObjectOpenHashMap::new, yq.d.a(Short::intValue, Integer::shortValue), cud.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cps h;
   private final cud i;
   private final Int2ObjectMap<cud> j;

   public agq(int $$0, int $$1, int $$2, int $$3, cps $$4, cud $$5, Int2ObjectMap<cud> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agq(wf $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cps.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cud.h.decode($$0);
   }

   private void a(wf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cud.h.encode($$0, this.i);
   }

   @Override
   public zd<agq> a() {
      return afz.bs;
   }

   public void a(agb $$0) {
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

   public cud g() {
      return this.i;
   }

   public Int2ObjectMap<cud> h() {
      return this.j;
   }

   public cps i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
