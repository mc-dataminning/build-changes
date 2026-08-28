import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahg implements zk<agq> {
   public static final zb<wo, ahg> a = zk.a(ahg::a, ahg::new);
   private static final int b = 128;
   private static final zb<wo, Int2ObjectMap<cvl>> c = yz.a(Int2ObjectOpenHashMap::new, yz.d.a(Short::intValue, Integer::shortValue), cvl.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final crb h;
   private final cvl i;
   private final Int2ObjectMap<cvl> j;

   public ahg(int $$0, int $$1, int $$2, int $$3, crb $$4, cvl $$5, Int2ObjectMap<cvl> $$6) {
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
      this.h = $$0.b(crb.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cvl.h.decode($$0);
   }

   private void a(wo $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cvl.h.encode($$0, this.i);
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

   public cvl g() {
      return this.i;
   }

   public Int2ObjectMap<cvl> h() {
      return this.j;
   }

   public crb i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
