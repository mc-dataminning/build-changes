import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahm implements zq<agw> {
   public static final zh<wu, ahm> a = zq.a(ahm::a, ahm::new);
   private static final int b = 128;
   private static final zh<wu, Int2ObjectMap<cwm>> c = zf.a(Int2ObjectOpenHashMap::new, zf.e.a(Short::intValue, Integer::shortValue), cwm.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final csk h;
   private final cwm i;
   private final Int2ObjectMap<cwm> j;

   public ahm(int $$0, int $$1, int $$2, int $$3, csk $$4, cwm $$5, Int2ObjectMap<cwm> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahm(wu $$0) {
      this.d = $$0.x();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(csk.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cwm.h.decode($$0);
   }

   private void a(wu $$0) {
      $$0.f(this.d);
      $$0.c(this.e);
      $$0.m(this.f);
      $$0.l(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cwm.h.encode($$0, this.i);
   }

   @Override
   public zs<ahm> a() {
      return agu.bv;
   }

   public void a(agw $$0) {
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

   public cwm g() {
      return this.i;
   }

   public Int2ObjectMap<cwm> h() {
      return this.j;
   }

   public csk i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
