import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class afz implements yn<afl> {
   public static final ye<vr, afz> a = yn.a(afz::a, afz::new);
   private static final int b = 128;
   private static final ye<vr, Int2ObjectMap<crj>> c = yc.a(Int2ObjectOpenHashMap::new, yc.d.a(Short::intValue, Integer::shortValue), crj.e, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cmy h;
   private final crj i;
   private final Int2ObjectMap<crj> j;

   public afz(int $$0, int $$1, int $$2, int $$3, cmy $$4, crj $$5, Int2ObjectMap<crj> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private afz(vr $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cmy.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = crj.e.decode($$0);
   }

   private void a(vr $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      crj.e.encode($$0, this.i);
   }

   @Override
   public yp<afz> a() {
      return afj.bq;
   }

   public void a(afl $$0) {
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

   public crj g() {
      return this.i;
   }

   public Int2ObjectMap<crj> h() {
      return this.j;
   }

   public cmy i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
