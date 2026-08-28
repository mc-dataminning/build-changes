import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface anx<T, R> {
   R apply(T var1) throws CommandSyntaxException;
}
