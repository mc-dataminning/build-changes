import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class eqw extends exs {
   private final LongSet b;
   private final LongSet c;
   private static final Codec<LongSet> d = Codec.LONG_STREAM.xmap(LongOpenHashSet::toSet, LongCollection::longStream);
   public static final Codec<eqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(d.fieldOf("All").forGetter($$0x -> $$0x.b), d.fieldOf("Remaining").forGetter($$0x -> $$0x.c)).apply($$0, eqw::new)
   );

   public static ext<eqw> a(String $$0) {
      return new ext<>($$0, eqw::new, a, bbb.o);
   }

   private eqw(LongSet $$0, LongSet $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public eqw() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public void a(long $$0) {
      this.b.add($$0);
      this.c.add($$0);
      this.f();
   }

   public boolean b(long $$0) {
      return this.b.contains($$0);
   }

   public boolean c(long $$0) {
      return this.c.contains($$0);
   }

   public void d(long $$0) {
      if (this.c.remove($$0)) {
         this.f();
      }
   }

   public LongSet a() {
      return this.b;
   }
}
