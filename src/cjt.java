import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum cjt implements aut, cjs {
   a("leather", 5, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 1);
      $$0.put(cjr.a.c, 2);
      $$0.put(cjr.a.b, 3);
      $$0.put(cjr.a.a, 1);
   }), 15, arc.ai, 0.0F, 0.0F, () -> cpi.a(cmk.qA)),
   b("chainmail", 15, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 1);
      $$0.put(cjr.a.c, 4);
      $$0.put(cjr.a.b, 5);
      $$0.put(cjr.a.a, 2);
   }), 12, arc.ac, 0.0F, 0.0F, () -> cpi.a(cmk.oB)),
   c("iron", 15, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 2);
      $$0.put(cjr.a.c, 5);
      $$0.put(cjr.a.b, 6);
      $$0.put(cjr.a.a, 2);
   }), 9, arc.ah, 0.0F, 0.0F, () -> cpi.a(cmk.oB)),
   d("gold", 7, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 1);
      $$0.put(cjr.a.c, 3);
      $$0.put(cjr.a.b, 5);
      $$0.put(cjr.a.a, 2);
   }), 25, arc.ag, 0.0F, 0.0F, () -> cpi.a(cmk.oF)),
   e("diamond", 33, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 3);
      $$0.put(cjr.a.c, 6);
      $$0.put(cjr.a.b, 8);
      $$0.put(cjr.a.a, 3);
   }), 10, arc.ad, 2.0F, 0.0F, () -> cpi.a(cmk.ov)),
   f("turtle", 25, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 2);
      $$0.put(cjr.a.c, 5);
      $$0.put(cjr.a.b, 6);
      $$0.put(cjr.a.a, 2);
   }), 9, arc.ak, 0.0F, 0.0F, () -> cpi.a(cmk.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 3);
      $$0.put(cjr.a.c, 6);
      $$0.put(cjr.a.b, 8);
      $$0.put(cjr.a.a, 3);
   }), 15, arc.aj, 3.0F, 0.1F, () -> cpi.a(cmk.oG));

   public static final Codec<cjt> h = aut.a(cjt::values);
   private static final EnumMap<cjr.a, Integer> i = ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, 13);
      $$0.put(cjr.a.c, 15);
      $$0.put(cjr.a.b, 16);
      $$0.put(cjr.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cjr.a, Integer> l;
   private final int m;
   private final arb n;
   private final float o;
   private final float p;
   private final att<cpi> q;

   private cjt(String $$0, int $$1, EnumMap<cjr.a, Integer> $$2, int $$3, arb $$4, float $$5, float $$6, Supplier<cpi> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new att<>($$7);
   }

   @Override
   public int a(cjr.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cjr.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public arb b() {
      return this.n;
   }

   @Override
   public cpi d() {
      return this.q.a();
   }

   @Override
   public String e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.o;
   }

   @Override
   public float g() {
      return this.p;
   }

   @Override
   public String c() {
      return this.j;
   }
}
