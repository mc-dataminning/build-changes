import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class agn implements zb<afz> {
   public static final ys<wf, agn> a = zb.a(agn::a, agn::new);
   private static final int b = 128;
   private static final ys<wf, Int2ObjectMap<csz>> c = yq.a(Int2ObjectOpenHashMap::new, yq.d.a(Short::intValue, Integer::shortValue), csz.e, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final com h;
   private final csz i;
   private final Int2ObjectMap<csz> j;

   public agn(int $$0, int $$1, int $$2, int $$3, com $$4, csz $$5, Int2ObjectMap<csz> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private agn(wf $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(com.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = csz.e.decode($$0);
   }

   private void a(wf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      csz.e.encode($$0, this.i);
   }

   @Override
   public zd<agn> a() {
      return afx.bq;
   }

   public void a(afz $$0) {
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

   public csz g() {
      return this.i;
   }

   public Int2ObjectMap<csz> h() {
      return this.j;
   }

   public com i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
