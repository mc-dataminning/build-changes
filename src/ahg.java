import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahg implements zk<agq> {
   public static final zb<wo, ahg> a = zk.a(ahg::a, ahg::new);
   private static final int b = 128;
   private static final zb<wo, Int2ObjectMap<cvp>> c = yz.a(Int2ObjectOpenHashMap::new, yz.d.a(Short::intValue, Integer::shortValue), cvp.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final crh h;
   private final cvp i;
   private final Int2ObjectMap<cvp> j;

   public ahg(int $$0, int $$1, int $$2, int $$3, crh $$4, cvp $$5, Int2ObjectMap<cvp> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahg(wo $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(crh.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cvp.h.decode($$0);
   }

   private void a(wo $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cvp.h.encode($$0, this.i);
   }

   @Override
   public zm<ahg> a() {
      return ago.bv;
   }

   public void a(agq $$0) {
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

   public cvp g() {
      return this.i;
   }

   public Int2ObjectMap<cvp> h() {
      return this.j;
   }

   public crh i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
