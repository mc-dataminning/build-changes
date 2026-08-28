import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ahh implements zs<ags> {
   public static final zj<ww, ahh> a = zs.a(ahh::a, ahh::new);
   private static final int b = 128;
   private static final zj<ww, Int2ObjectMap<cuk>> c = zh.a(Int2ObjectOpenHashMap::new, zh.d.a(Short::intValue, Integer::shortValue), cuk.h, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cpy h;
   private final cuk i;
   private final Int2ObjectMap<cuk> j;

   public ahh(int $$0, int $$1, int $$2, int $$3, cpy $$4, cuk $$5, Int2ObjectMap<cuk> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ahh(ww $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cpy.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cuk.h.decode($$0);
   }

   private void a(ww $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cuk.h.encode($$0, this.i);
   }

   @Override
   public zu<ahh> a() {
      return agq.bs;
   }

   public void a(ags $$0) {
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

   public cuk g() {
      return this.i;
   }

   public Int2ObjectMap<cuk> h() {
      return this.j;
   }

   public cpy i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
