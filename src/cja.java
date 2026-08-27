import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum cja implements auk, ciz {
   a("leather", 5, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 1);
      $$0.put(ciy.a.c, 2);
      $$0.put(ciy.a.b, 3);
      $$0.put(ciy.a.a, 1);
   }), 15, aqv.ai, 0.0F, 0.0F, () -> coq.a(clr.qA)),
   b("chainmail", 15, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 1);
      $$0.put(ciy.a.c, 4);
      $$0.put(ciy.a.b, 5);
      $$0.put(ciy.a.a, 2);
   }), 12, aqv.ac, 0.0F, 0.0F, () -> coq.a(clr.oB)),
   c("iron", 15, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 2);
      $$0.put(ciy.a.c, 5);
      $$0.put(ciy.a.b, 6);
      $$0.put(ciy.a.a, 2);
   }), 9, aqv.ah, 0.0F, 0.0F, () -> coq.a(clr.oB)),
   d("gold", 7, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 1);
      $$0.put(ciy.a.c, 3);
      $$0.put(ciy.a.b, 5);
      $$0.put(ciy.a.a, 2);
   }), 25, aqv.ag, 0.0F, 0.0F, () -> coq.a(clr.oF)),
   e("diamond", 33, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 3);
      $$0.put(ciy.a.c, 6);
      $$0.put(ciy.a.b, 8);
      $$0.put(ciy.a.a, 3);
   }), 10, aqv.ad, 2.0F, 0.0F, () -> coq.a(clr.ov)),
   f("turtle", 25, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 2);
      $$0.put(ciy.a.c, 5);
      $$0.put(ciy.a.b, 6);
      $$0.put(ciy.a.a, 2);
   }), 9, aqv.ak, 0.0F, 0.0F, () -> coq.a(clr.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 3);
      $$0.put(ciy.a.c, 6);
      $$0.put(ciy.a.b, 8);
      $$0.put(ciy.a.a, 3);
   }), 15, aqv.aj, 3.0F, 0.1F, () -> coq.a(clr.oG));

   public static final Codec<cja> h = auk.a(cja::values);
   private static final EnumMap<ciy.a, Integer> i = ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, 13);
      $$0.put(ciy.a.c, 15);
      $$0.put(ciy.a.b, 16);
      $$0.put(ciy.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<ciy.a, Integer> l;
   private final int m;
   private final aqu n;
   private final float o;
   private final float p;
   private final atl<coq> q;

   private cja(String $$0, int $$1, EnumMap<ciy.a, Integer> $$2, int $$3, aqu $$4, float $$5, float $$6, Supplier<coq> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new atl<>($$7);
   }

   @Override
   public int a(ciy.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(ciy.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aqu b() {
      return this.n;
   }

   @Override
   public coq d() {
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
