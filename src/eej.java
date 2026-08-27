import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eej {
   public static final Codec<eej> e = ki.ai.q().dispatch("element_type", eej::a, eek::codec);
   private static final il<eha> a = il.a(new eha(List.of()));
   @Nullable
   private volatile eel.a b;

   protected static <E extends eej> RecordCodecBuilder<E, eel.a> d() {
      return eel.a.c.fieldOf("projection").forGetter(eej::e);
   }

   protected eej(eel.a $$0) {
      this.b = $$0;
   }

   public abstract jg a(ehd var1, dgm var2);

   public abstract List<ehc.c> a(ehd var1, ib var2, dgm var3, axd var4);

   public abstract ecu a(ehd var1, ib var2, dgm var3);

   public abstract boolean a(ehd var1, cxu var2, cxs var3, dow var4, ib var5, ib var6, dgm var7, ecu var8, axd var9, boolean var10);

   public abstract eek<?> a();

   public void a(cxa $$0, ehc.c $$1, ib $$2, dgm $$3, axd $$4, ecu $$5) {
   }

   public eej a(eel.a $$0) {
      this.b = $$0;
      return this;
   }

   public eel.a e() {
      eel.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eel.a, eec> g() {
      return $$0 -> eec.b;
   }

   public static Function<eel.a, eeg> a(String $$0) {
      return $$1 -> new eeg(Either.left(new ajh($$0)), a, $$1);
   }

   public static Function<eel.a, eeg> a(String $$0, il<eha> $$1) {
      return $$2 -> new eeg(Either.left(new ajh($$0)), $$1, $$2);
   }

   public static Function<eel.a, eei> b(String $$0) {
      return $$1 -> new eei(Either.left(new ajh($$0)), a, $$1);
   }

   public static Function<eel.a, eei> b(String $$0, il<eha> $$1) {
      return $$2 -> new eei(Either.left(new ajh($$0)), $$1, $$2);
   }

   public static Function<eel.a, eed> a(il<ecg> $$0) {
      return $$1 -> new eed($$0, $$1);
   }

   public static Function<eel.a, eeh> b(List<Function<eel.a, ? extends eej>> $$0) {
      return $$1 -> new eeh($$0.stream().map($$1x -> (eej)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
