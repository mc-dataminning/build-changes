import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum ckd implements ave, ckc {
   a("leather", 5, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 1);
      $$0.put(ckb.a.c, 2);
      $$0.put(ckb.a.b, 3);
      $$0.put(ckb.a.a, 1);
   }), 15, arm.ai, 0.0F, 0.0F, () -> cps.a(cmu.qA)),
   b("chainmail", 15, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 1);
      $$0.put(ckb.a.c, 4);
      $$0.put(ckb.a.b, 5);
      $$0.put(ckb.a.a, 2);
   }), 12, arm.ac, 0.0F, 0.0F, () -> cps.a(cmu.oB)),
   c("iron", 15, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 2);
      $$0.put(ckb.a.c, 5);
      $$0.put(ckb.a.b, 6);
      $$0.put(ckb.a.a, 2);
   }), 9, arm.ah, 0.0F, 0.0F, () -> cps.a(cmu.oB)),
   d("gold", 7, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 1);
      $$0.put(ckb.a.c, 3);
      $$0.put(ckb.a.b, 5);
      $$0.put(ckb.a.a, 2);
   }), 25, arm.ag, 0.0F, 0.0F, () -> cps.a(cmu.oF)),
   e("diamond", 33, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 3);
      $$0.put(ckb.a.c, 6);
      $$0.put(ckb.a.b, 8);
      $$0.put(ckb.a.a, 3);
   }), 10, arm.ad, 2.0F, 0.0F, () -> cps.a(cmu.ov)),
   f("turtle", 25, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 2);
      $$0.put(ckb.a.c, 5);
      $$0.put(ckb.a.b, 6);
      $$0.put(ckb.a.a, 2);
   }), 9, arm.ak, 0.0F, 0.0F, () -> cps.a(cmu.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 3);
      $$0.put(ckb.a.c, 6);
      $$0.put(ckb.a.b, 8);
      $$0.put(ckb.a.a, 3);
   }), 15, arm.aj, 3.0F, 0.1F, () -> cps.a(cmu.oG));

   public static final Codec<ckd> h = ave.a(ckd::values);
   private static final EnumMap<ckb.a, Integer> i = ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, 13);
      $$0.put(ckb.a.c, 15);
      $$0.put(ckb.a.b, 16);
      $$0.put(ckb.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<ckb.a, Integer> l;
   private final int m;
   private final arl n;
   private final float o;
   private final float p;
   private final aud<cps> q;

   private ckd(String $$0, int $$1, EnumMap<ckb.a, Integer> $$2, int $$3, arl $$4, float $$5, float $$6, Supplier<cps> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new aud<>($$7);
   }

   @Override
   public int a(ckb.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(ckb.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public arl b() {
      return this.n;
   }

   @Override
   public cps d() {
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
