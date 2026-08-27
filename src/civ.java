import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum civ implements aug, ciu {
   a("leather", 5, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 1);
      $$0.put(cit.a.c, 2);
      $$0.put(cit.a.b, 3);
      $$0.put(cit.a.a, 1);
   }), 15, aqr.ai, 0.0F, 0.0F, () -> cok.a(clm.qA)),
   b("chainmail", 15, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 1);
      $$0.put(cit.a.c, 4);
      $$0.put(cit.a.b, 5);
      $$0.put(cit.a.a, 2);
   }), 12, aqr.ac, 0.0F, 0.0F, () -> cok.a(clm.oB)),
   c("iron", 15, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 2);
      $$0.put(cit.a.c, 5);
      $$0.put(cit.a.b, 6);
      $$0.put(cit.a.a, 2);
   }), 9, aqr.ah, 0.0F, 0.0F, () -> cok.a(clm.oB)),
   d("gold", 7, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 1);
      $$0.put(cit.a.c, 3);
      $$0.put(cit.a.b, 5);
      $$0.put(cit.a.a, 2);
   }), 25, aqr.ag, 0.0F, 0.0F, () -> cok.a(clm.oF)),
   e("diamond", 33, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 3);
      $$0.put(cit.a.c, 6);
      $$0.put(cit.a.b, 8);
      $$0.put(cit.a.a, 3);
   }), 10, aqr.ad, 2.0F, 0.0F, () -> cok.a(clm.ov)),
   f("turtle", 25, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 2);
      $$0.put(cit.a.c, 5);
      $$0.put(cit.a.b, 6);
      $$0.put(cit.a.a, 2);
   }), 9, aqr.ak, 0.0F, 0.0F, () -> cok.a(clm.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 3);
      $$0.put(cit.a.c, 6);
      $$0.put(cit.a.b, 8);
      $$0.put(cit.a.a, 3);
   }), 15, aqr.aj, 3.0F, 0.1F, () -> cok.a(clm.oG));

   public static final Codec<civ> h = aug.a(civ::values);
   private static final EnumMap<cit.a, Integer> i = ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, 13);
      $$0.put(cit.a.c, 15);
      $$0.put(cit.a.b, 16);
      $$0.put(cit.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cit.a, Integer> l;
   private final int m;
   private final aqq n;
   private final float o;
   private final float p;
   private final ath<cok> q;

   private civ(String $$0, int $$1, EnumMap<cit.a, Integer> $$2, int $$3, aqq $$4, float $$5, float $$6, Supplier<cok> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new ath<>($$7);
   }

   @Override
   public int a(cit.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cit.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aqq b() {
      return this.n;
   }

   @Override
   public cok d() {
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
